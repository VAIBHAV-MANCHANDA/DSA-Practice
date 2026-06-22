class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    // Insert at head
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(50);
        list.printList();
    }
}