import java.util.*;

public class Subarray {
    public static boolean isSubarray(int A[], int B[] ){
        HashSet<Integer> set = new HashSet<>();

        for(int num : A){
            set.add(num);
        }
        
        for(int num : B){
            if(!set.contains(num)){
                return false;
            }

        }
        
        return true;
    }

    public static void main(String[] args){
        int A[] = {1,2,3,4,5,6,7,8,9,};
        int B[] = {2,4,6,8};
         if(isSubarray(A,B)) System.out.println("Yes B is subarray of A :");
         else System.out.println("No , B is not Subarray of A :");

    }
    
}
