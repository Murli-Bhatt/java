
public class NthList {
    static Node head = null;
    static int size = 0;

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

        } else if (head.next == null) {
            head.next = n2;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = n2;
        }

    }

    public static Node nthListFromLast(int n) {
        if (head == null) {
            return null;
        }
        if (head.next == null && n == 1) {
            return head;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            size++;

        }
        if (n == size) {
            return head;
        }
        if (size < n) {
            return null;
        }
        int i = 0;
        temp = head;

        while (i < size - n) {
            temp = temp.next;
            i++;
        }
        return temp;

    }

    public static Node deleteNthNodeFromLast(int n ){
        if(n==size){
            return head = head.next;
        }
        Node temp = head;
       int i =0;
        while(i<size-n-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;

    }
    public static void printList(){
        Node temp =head;
        while(temp !=null){
            System.out.print(temp.val+"->");
            temp =temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        head = n1;
        Addlist(2);
        Addlist(3);
        Addlist(4);
        Addlist(5);
        System.out.println(nthListFromLast(1).val);
        printList();
        deleteNthNodeFromLast(1);
        printList();


    }

}
