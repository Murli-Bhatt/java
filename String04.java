
//    str = "accbmnchg",  move all the 'c' at the  end of the string  
public class String04 {
    public static int count = 0;
    public static void countC(String str,char ch,int idx,String newStr){
        if(idx  == str.length()){
            for(int i =0 ; i<count;i++){
               newStr = newStr.concat("c");
            }
            System.out.println(newStr);
            return ;
        }

        if(ch == str.charAt(idx)){
            count +=1;
            countC(str, ch, idx +1,newStr);

        }
        else{
            countC(str, ch, idx +1,newStr+str.charAt(idx));

        }
    }
    public static void main(String[] args){
        String str = new String("accbmnchg");
        countC(str, 'c', count, "");
    }
    
}
