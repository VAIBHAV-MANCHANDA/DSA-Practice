import java.util.*;
public class DeleteLast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter values:");
        for(int i = 0; i<n; i++){

        }
    }
}

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
   
    public void deletelast(){
        
        if(head == null){
            return;
        }

        if(head.next == null ){
            head = null;
            return;
        }
        
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next = null;
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
    }
}

