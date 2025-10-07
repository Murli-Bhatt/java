import java.util.*;


public class Findduplicate {
    public static int duplicate(ArrayList<Integer> vec) {
        int slow = vec.get(0);
        int fast = vec.get(0);

        do {
            slow = vec.get(slow);
            fast = vec.get(vec.get(fast));

        } while (slow != fast);

        // finding entry point (duoplicate )
        slow = vec.get(0);

        while (slow != fast) {
            slow = vec.get(slow);
            fast = vec.get(fast);

        }
        return slow;

    }

    public static void main(String[] args) {
       ArrayList<Integer> vec = new ArrayList<>();
        vec.add(3);
        vec.add(2);
        vec.add(4);
        vec.add(2);
        vec.add(1);

        int dplc = duplicate(vec);
        System.out.println(dplc);

    }

}
