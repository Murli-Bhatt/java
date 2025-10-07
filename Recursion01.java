public class Recursion01 {

        // Method 1: Print from 1 to n (ascending order)
    public static void printNumbers1ToN(int current, int n) {
        if (current > n) {
            return;  // Base case
        }
        
        System.out.println(current);
        printNumbers1ToN(current + 1, n);  // Recursive call with current+1
    }
     public static void printNumbers(int n) {
        if (n <= 0) {
            return;  // Base case
        }
        
        printNumbers(n - 1);  // Recursive call first
        System.out.println(n);  // Print after recursive call
    }
    
    public static void main(String[] args){
        printNumbers(10);
     printNumbers1ToN(11,20 );
    }
}
