import java.util.Scanner;


import java.util.*;

public class payroll{

    /**
     * 
     */
    public static void main(String[] args){

            System.out.println("Enter yout salary : ");
            Scanner sc = new Scanner(System.in);

            int basicpay =sc.nextInt();
                int HRA = 0 ;
                int DA = 0 ;

            if(basicpay >= 5000){
                 HRA = 10* basicpay/100;
                 DA = 20* basicpay/100;


            } else if(basicpay <= 5000){
                 DA = 30*basicpay/100;
                 HRA= 20*basicpay/100;
                

            }
            int grosspay = basicpay+HRA+DA ;
            System.out.println("your gross salary is : " + grosspay);
    


    }

        
      
    


}