import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    //Insert at end , to build list from input
    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null){ // temp pointer used , only pointing here , no adding
            temp = temp.next; // temp moves further
        }

        temp.next = newNode; // addition at last , when temp points null
    }

    //Delete head
    public void deleteHead(){
         if (head == null){
            System.out.println("List empty");
            return;
         }
         head = head.next;
    }

    // Print linked List
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class DeleteHead{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        // Take input
        System.out.print("Enter number of nodes");
        int n = sc.nextInt();

        System.out.println("Enter elements");
        for(int i = 0; i<n; i++){
            int val = sc.nextInt();
            list.insertAtEnd(val);
        }

        //Original List 
        System.out.print("Original List:");
        list.printList();

        //Delete head
        list.deleteHead();

        //updated list
        System.out.print("After deleting head:");
        list.printList();
    }
}