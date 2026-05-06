package Data_Structure_And_Algorithm.Linked_List;

class Process {
    int pid, burstTime, remainingTime;
    Process next;

    Process(int pid, int burstTime) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }
}

class CircularQueue {
    Process head = null, tail = null;

    void addProcess(int pid, int bt) {
        Process p = new Process(pid, bt);
        if (head == null) {
            head = tail = p;
            tail.next = head;
            return;
        }
        tail.next = p;
        tail = p;
        tail.next = head;
    }

    void remove(Process prev, Process curr) {
        if (curr == head && curr == tail) {
            head = tail = null;
            return;
        }
        if (curr == head) {
            head = head.next;
            tail.next = head;
            return;
        }
        if (curr == tail) {
            tail = prev;
            tail.next = head;
            return;
        }
        prev.next = curr.next;
    }

    void roundRobin(int tq) {
        if (head == null) return;

        Process curr = head, prev = tail;
        int time = 0, totalWT = 0, totalTAT = 0, count = 0;

        while (head != null) {
            if (curr.remainingTime > tq) {
                time += tq;
                curr.remainingTime -= tq;
            } else {
                time += curr.remainingTime;
                totalWT += (time - curr.burstTime);
                totalTAT += time;
                count++;
                remove(prev, curr);
                curr = prev.next;
                continue;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Avg Waiting Time: " + (totalWT / (double)count));
        System.out.println("Avg Turnaround Time: " + (totalTAT / (double)count));
    }
}

public class RoundRobinSchedulingAlgorithm {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        q.addProcess(1, 10);
        q.addProcess(2, 5);
        q.addProcess(3, 8);

        q.roundRobin(3);
    }
}