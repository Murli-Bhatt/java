public class Palindrome01 {
    public static void palindrome(String st){
        int len  = st.length();

        for(int i =0 ; i<len;i++){
            if(st.charAt(i) != st.charAt(len-i-1)){
                System.out.println("string is not palindrome");
                return;

            }
        }
        System.out.println("given string is  palindrome :");



    }
    public static void main(String[] args){
        String st = "ababa";
        palindrome(st);
    }
    
}
