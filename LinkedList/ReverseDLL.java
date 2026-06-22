// here using insert at end
class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class LinkedList{
    Node head;

    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void reverseDLL(){
        
        Node current = head;
        Node temp = null;

        while(current != null){

            //swap previous and next
            temp = current.prev;
            current.prev =  current.next;
            current.next =  temp;

            // Move to next node
            current = current.prev;
        }

        if(temp != null){
            head = temp.prev;
        }
    }

    public void printList(){
        Node temp = head;
        while(temp != null  ){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class ReverseDLL {
    public static void main(String[] args){
        LinkedList dll = new LinkedList();

        dll.insertAtEnd(80);
        dll.insertAtEnd(10);
        dll.insertAtEnd(50);
        dll.insertAtEnd(0);

        System.out.println("Original");
        dll.printList();

        dll.reverseDLL();

        System.out.println("Reversed");
        dll.printList();
    }
}
