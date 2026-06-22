// Doubly Linked List

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        prev = null;
        next = null;
    }
}

class LinkedList{
    Node head;

    public void insertBeforeHead(int data){

        Node newNode = new Node(data);
        newNode.next = head;

        if(head!=null){
            head.prev = newNode;
        }

        head = newNode;

    }

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


public class InsertBeforeHead{
    public static void main(String[] args){

        LinkedList list = new LinkedList();

        list.insertBeforeHead(3);
        list.insertBeforeHead(5);
        list.insertBeforeHead(2);
        
        list.printList();
    }


}

