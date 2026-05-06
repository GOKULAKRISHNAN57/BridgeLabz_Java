package Data_Structure_And_Algorithm.Linked_List;

import java.time.LocalDate;
import java.util.TreeSet;

class Node{

    final String Movie;
    final String Title;
    final String Director;
    final LocalDate Release;

    Node next = null;
    Node prev = null;

    Node(String Movie, String Title, String Director, LocalDate Release){
        this.Movie = Movie;
        this.Title = Title;
        this.Director = Director;
        this.Release = Release;
    }

}

class NodeLinking{

    Node head = null;
    Node tail = null;

    void insertion(Node node){

        if(head == null){
            head = node;
        }
        else{
            tail.next = node;
            node.prev = tail;
        }

        tail = node;
    }

}

public class Movie_Management_System {

    public static void main(String[] args) {


        Node movie1 = new Node("Thuppakki","Thuppakki", "ARM", LocalDate.of(2012,11,13));
        Node movie2 = new Node("Ayan","Ayan", "KVA", LocalDate.of(2009,4,3));

        NodeLinking doublyLinkedList = new NodeLinking();
        doublyLinkedList.insertion(movie1);
        doublyLinkedList.insertion(movie2);

        //forward display
        Node traverse = doublyLinkedList.head;
        while (traverse != null){
            System.out.print(traverse.Movie + " ");
            traverse = traverse.next;
        }

        System.out.println();

        //reverse display
        Node traverse2 = doublyLinkedList.tail;
        while (traverse2 != null){
            System.out.print(traverse2.Movie + " ");
            traverse2 = traverse2.prev;
        }
    }
}
