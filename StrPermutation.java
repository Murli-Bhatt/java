public class StrPermutation {
    public static void printPermutation(String str,String perm ){
        if(str.length() ==0){
            
       System.out.println(perm);
            return;
        }
        for(int i =0;i<str.length();i++){
            String remain = str.substring(0,i) + str.substring(i+1);
            printPermutation(remain,perm+str.charAt(i));
            

        }
    }
    public static void main(String[] args){
        String str = new String();
        str = "ABC";
printPermutation(str, "");
    }
    
}
