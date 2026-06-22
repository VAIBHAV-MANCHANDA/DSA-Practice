class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
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
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
   

}

public class InsertEnd {
    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();
        linkedList.insertAtEnd(50);
        linkedList.insertAtEnd(20);
        linkedList.printList();
    }
   
}
