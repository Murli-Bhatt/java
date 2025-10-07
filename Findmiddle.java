import java.util.*;
public class Findmiddle {

   static class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Middle(Node head) {
        if(head == null) return null;
        Node first = head;
        Node second = head;
        while(second != null && second.next != null) {
            first = first. next;
            second = second.next.next;
        }
        return first;
    
    }
   public static void main (String[] args){
    Node node = new Node(2);
    node.next = new Node(3);
    node.next.next = new Node(4);
    node.next.next.next = new Node(5);
    node.next.next.next.next = new Node(6);

     Node middle=Middle(node);
     System.out.println("middle node is : " + (middle != null ? middle.data : "List is empty"));

   }


}
