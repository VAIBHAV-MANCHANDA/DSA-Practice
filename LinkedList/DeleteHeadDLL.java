class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class LinkedList{

    Node head;

    public void insertBeforeHead(int data){
        Node newNode = new Node(data);

        newNode.next = head;

        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void deleteHead(){
        if(head == null){
            return;
        }
        head = head.next;
        if(head != null){
            head.prev = null;
        }      

    }

    public void printList(){

        Node temp = head;

        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DeleteHeadDLL {
    public static void main(String[] args){

        LinkedList list = new LinkedList();

        list.insertBeforeHead(5);
        list.insertBeforeHead(6);
        list.insertBeforeHead(54);
        list.insertBeforeHead(25);

        System.out.println("Original");
        list.printList();

        list.deleteHead();
        
        System.out.println("Deleting Head");
        list.printList();
    }
}
