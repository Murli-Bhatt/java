import java.util.*;
public class StringB{
    public static void main (String args[]){
        StringBuilder sb = new StringBuilder();
         
    //    sb.append("he");
    //    System.out.println(sb+" "+sb.capacity());
    //    sb.append('l');
    //     System.out.println(sb+" "+sb.capacity());
    //     sb.append("lo");
    //     System.out.println(sb+" "+sb.capacity());
    //     sb.deleteCharAt(2);

  
        // System.out.println(sb);
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine();
        System.out.println(s);
     sb.append(s);
     System.out.println(sb.substring(0, 5));

    }
    
}
