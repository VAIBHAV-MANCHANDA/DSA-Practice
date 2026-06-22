import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    
    Node(int data, Node next, Node prev){
        this.data= data;
        this.next = next;
        this.prev = prev;
    }

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class LinkedList{
Node head;
 public void insertElementAtEnd(int data){
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
    newNode.prev =  temp;   
 }

 public void reverseDLL(){
    ArrayList<Integer> list = new ArrayList<>();

    // Store all node values
    Node temp = head;
    while(temp != null){
        list.add(temp.data);
        temp = temp.next;
    }

    // Traverse again
    temp = head;
    int i = list.size()-1;

    // Replace values in reverse order 
    while(temp != null){
        temp.data = list.get(i);
        i--;
        temp = temp.next;
    }  
  }

  public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+" <-> ");
        temp = temp.next;
    }
    System.out.println("NULL");
  }
}

public class ReverseDLLbruteForce {
    public static void main(String[] args){
        
        LinkedList dll = new LinkedList();

        dll.insertElementAtEnd(50);
        dll.insertElementAtEnd(80);
        dll.insertElementAtEnd(10);
        dll.insertElementAtEnd(0);

        System.out.println("Original");
        dll.display();

        dll.reverseDLL();

        System.out.println("Reversed");
        dll.display();
    }
}
