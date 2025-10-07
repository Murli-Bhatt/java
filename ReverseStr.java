public class ReverseStr {
    public static void reverseStr(String str ,int idx){
        if(idx ==str.length()-1){
            System.out.print(str.charAt(idx));
            return;
        }
        reverseStr(str, idx+1);
        System.out.print(str.charAt(idx));


    }

    public static void main(String[] args){
        String str= "abcd";
        reverseStr(str, 0);

    }
    
}
