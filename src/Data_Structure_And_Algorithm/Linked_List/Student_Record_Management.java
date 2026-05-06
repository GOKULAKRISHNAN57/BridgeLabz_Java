package Data_Structure_And_Algorithm.Linked_List;

class SinglyLinkedListNode{

    final int RollNumber;
    final String Name;
    final int Age;
    final String Grade;

    SinglyLinkedListNode next = null;
    SinglyLinkedListNode head = null;
    SinglyLinkedListNode marker = null;


    SinglyLinkedListNode(int RollNumber, String Name, int Age, String Grade){
        this.RollNumber = RollNumber;
        this.Name = Name;
        this.Age = Age;
        this.Grade = Grade;
        add(this);
    }

     void add(SinglyLinkedListNode node){
        if(marker == null){
            head = node;
        }
        else{
            marker.next = node;
        }
        marker = node;
    }

}

public class Student_Record_Management {
    public static void main(String[] args) {

        SinglyLinkedListNode student1 = new SinglyLinkedListNode(776,"logesh",21,"A-");
        SinglyLinkedListNode student2 = new SinglyLinkedListNode(779,"prannet",21,"A--");
        SinglyLinkedListNode student3 = new SinglyLinkedListNode(798,"gokulakrishnan",21,"A++");

        SinglyLinkedListNode traverseNode  = student1.head;

        while(traverseNode != null){

            System.out.print(traverseNode.Name);
            System.out.print(" " + traverseNode.RollNumber);
            System.out.print(" " + traverseNode.Age);
            System.out.print(" " + traverseNode.Grade);
            System.out.println();

            traverseNode = traverseNode.next;
        }
    }
}