
 public class lllist{
    static Node head = null;
  lllist(){
    this.head = head;
  }
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

     public static void  addFirst(int val){
        Node n2 = new Node(val);

        if(head==null){
            head = n2;
            

        }
        else {
            n2.next =head;
            head =n2;
            
        }
     }
     public static void addLast(int val){
        Node n2 = new Node(val);

        if(head == null){
            head = n2;

        }
        else if(head.next == null){
            head.next = n2;
        }
        else {
            Node temp =head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n2;
        }
     }
     

     public static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp =temp.next;
        }
        System.out.println("null");
     }
     
     
    public static void main(String[] args){
        
       Node n1 = new Node(1);
       head = n1;
       addFirst( 2);
       printList();
       addLast(3);
       addLast(4);
       printList();

      

    }

}