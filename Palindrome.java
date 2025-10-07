import java.util.*;


public class Palindrome {

    public static boolean isPalindrome(String str) {
        int len = str.length();
        Stack<Character> s = new Stack<>();

         // push first half in stack
         for(int i = 0; i<len/2; i++) {
            s.push(str.charAt(i));
            
         }

         //STARTING POINT 

         int st = (len%2 == 0 )? len/2 : len/2+1;
         //compare second half with stack

         for(int i =st;i<len;i++){
            if(s.pop() != str.charAt(i)){
                return false;
            }
           
         }


    
        return true;
    }

    public static void main(String[] args){
        System.out.println("Enter a palindrome string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //  nextLine for taking a string as a input
        if(isPalindrome(str)){
            System.out.println("String is palindrome :");

        }else {
            System.out.println("String is not a valid palindrome  : try again :");
        }
        sc.close();
    }

}
