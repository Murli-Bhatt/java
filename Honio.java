//Tower OF Honio

public class Honio {
    public static void honioTower(int n,String src,String helper,String dest){
        if(n ==1){
            System.out.println("transfer disk  " + n +" from  "+src+"  to  "+dest);
            return;

        }
       honioTower(n-1, src, dest, helper);
       System.out.println("  transfer disk  "+n+"  from  "+src+"  to  "+dest);
       honioTower(n-1, helper, src, dest);
    }
    public static void main(String[] args){
        int n =3;
        honioTower(n, "S", "H", "D");

    }
    
}
