//find first and last occurence of a char in the given string

public class StrProb01 {
    public static int first = -1;
    public static int last =-1;
    public static void firstLastOccur(String str,char ch,int idx){
         if(idx == str.length()-1){
            return ;
         }

         if(str.charAt(idx) == ch){
            if(first == -1){
                first = idx;
                last = idx;

            }else{
                last =idx;
            } 
         }
         firstLastOccur(str, ch, idx+1);
    }
    public static void main(String[] args){
        String str = "absadasf";
       char ch = 'a';
        firstLastOccur(str, ch, 0);
        System.out.println("First occurence of Char  "+ch+"  is "+first+" and last occurence is  "+last);

    }
    
}
