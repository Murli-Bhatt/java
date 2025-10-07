import java.util.*;
public class PalindromeList{
    static Node head =null;
    static int size =0;
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;

        }

    }
       public static void Addlist(int val) {
        Node n2 = new Node(val);
        if (head == null) {
            head = n2;
            size++;

        } else if (head.next == null) {
            head.next = n2;
            size++;
        } else {
            Node temp = head;
            
            while (temp.next != null) {
                temp = temp.next;
                

            }
            temp.next = n2;
            size++;
        }
    }
    public static Node reverseList(Node temp){
        if(temp == null || temp.next == null){
            return temp ;
        }
        Node prev = head;
        Node prev2 = head;
        while(temp != null){
            prev2 = temp.next;
             temp.next =prev;
             prev =prev2;
             temp = prev2;
             
        }
       return prev;


    }
    public static boolean isPalindrome(){
        int secStart = 0;
        if(size%2 != 0){
            secStart = size/2 +2;

        }
        else{
            secStart = size/2+1;
        }
        Node temp = head;

        int i =0;
        while(i<secStart){
            temp =temp.next;
            i++;
        }
        Node sechead = reverseList(temp);
        i =0;
        Node temp1 =head;
        Node temp2 = sechead;
        int flag=0;
        while(secStart<size){

            if(temp1.val != temp2.val){
                flag =1;
                break;

            }
            temp1 = temp1.next;
            temp2 = temp2.next;
            
        }
        if(flag ==0){
            return false;
      
        }
             
        else {
            return true;
        }
            
    

        

    }
    public static void main(String[] args){
        Addlist(1);
        Addlist(2);
        Addlist(1);
        System.out.println(isPalindrome());
        

    }


}