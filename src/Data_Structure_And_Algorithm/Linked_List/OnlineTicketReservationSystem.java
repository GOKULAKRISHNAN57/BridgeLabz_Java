package Data_Structure_And_Algorithm.Linked_List;

class Ticket {
    int id;
    String name, movie, seat, time;
    Ticket next;

    Ticket(int id, String name, String movie, String seat, String time) {
        this.id = id;
        this.name = name;
        this.movie = movie;
        this.seat = seat;
        this.time = time;
    }
}

class TicketList {
    Ticket head = null, tail = null;

    void add(Ticket t) {
        if (head == null) {
            head = tail = t;
            tail.next = head;
            return;
        }
        tail.next = t;
        tail = t;
        tail.next = head;
    }

    void remove(int id) {
        if (head == null) return;

        Ticket curr = head, prev = tail;

        do {
            if (curr.id == id) {
                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void display() {
        if (head == null) return;

        Ticket t = head;
        do {
            System.out.println(t.id + " " + t.name + " " + t.movie);
            t = t.next;
        } while (t != head);
    }

    void search(String key) {
        if (head == null) return;

        Ticket t = head;
        do {
            if (t.name.equalsIgnoreCase(key) || t.movie.equalsIgnoreCase(key)) {
                System.out.println("Found: " + t.id);
            }
            t = t.next;
        } while (t != head);
    }

    void count() {
        if (head == null) return;

        int c = 0;
        Ticket t = head;
        do {
            c++;
            t = t.next;
        } while (t != head);

        System.out.println("Total Tickets: " + c);
    }
}

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        TicketList t = new TicketList();

        t.add(new Ticket(1, "A", "Movie1", "S1", "10AM"));
        t.add(new Ticket(2, "B", "Movie2", "S2", "1PM"));

        t.display();
        t.search("Movie1");
        t.count();
    }
}