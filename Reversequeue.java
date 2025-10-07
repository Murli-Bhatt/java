import java.util.*;
public class Reversequeue {

public static void reverseQueue( Queue<Integer> queue) {
     if(queue.isEmpty()) return;
     int element = queue.poll(); // remove element from starting andalso return it
     reverseQueue(queue); 
     queue.offer(element); // add to back

    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);

        reverseQueue(q);
        System.out.println(q);

    }
    
}
