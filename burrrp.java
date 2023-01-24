import java.util.*;
public class burrrp {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("how long is your burp ?");

        int burpLength = sc.nextInt();

        String msg ="";

        for(int i = 1; i<= burpLength; i++ ){

            msg = msg+"r";
        }
        System.out.println("bu"+msg+"p");


    }
    
}
