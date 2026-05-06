package Data_Structure_And_Algorithm.Linked_List;

import java.time.LocalDate;

class CircularNode{

    int Task_ID;
    String Task_Name;
    String Priority;
    LocalDate Due_Date;
    CircularNode next = null;

    CircularNode(int Task_ID, String Task_Name, String Priority, LocalDate Due_Date){
        this.Task_ID = Task_ID;
        this.Task_Name = Task_Name;
        this.Priority = Priority;
        this.Due_Date = Due_Date;
    }

}

class LinkingCircularNodes{

    CircularNode head = null;
    CircularNode tail = null;
    static int length = 0;

    void insert(CircularNode node){

        length++;

        if(head == null){
            head = node;
            tail = node;
            node.next = head;
        }
        else{
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }

    void display(){

        int count = 0;
        CircularNode traverse = head;

        while (count <= length*2){
            System.out.print(traverse.Task_Name+" ");
            traverse = traverse.next;
            count++;
        }
        
    }

}

public class Task_Scheduler {
    public static void main(String[] args) {
        LinkingCircularNodes node = new LinkingCircularNodes();
        node.insert(new CircularNode(366,"user interface","home page",LocalDate.of(2026,5,12)));
        node.insert(new CircularNode(367,"backend logic","mvc",LocalDate.of(2026,5,21)));
        node.insert(new CircularNode(368,"database connection","database",LocalDate.of(2026,5,24)));
        node.insert(new CircularNode(369,"full website testing","testing",LocalDate.of(2026,5,27)));

        node.display();
    }
}
