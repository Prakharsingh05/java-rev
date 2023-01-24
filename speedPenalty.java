
import java.util.Scanner;

public class speedPenalty {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed: ");
        int speed=sc.nextInt();

        System.out.println("Today is your birthday :");
        boolean  isbirthdaay=sc.nextBoolean();

        if(isbirthdaay==true)
        {
            speed=speed-5;
        }
        if(speed>80)
        System.out.print("High ticket");
        else if(speed>=60)
        System.out.print("mid ticket");
        else 
        System.out.print("no ticket");

    }
    
}
