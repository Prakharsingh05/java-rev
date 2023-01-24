import java.util.Random;
import java.util.Scanner;
public class guessThenum {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int RandomNumber = rnd.nextInt(20);

        //System.out.println("Random Number:" + RandomNumber );

        //guess the number
        for(int i = 1; i<=6; i++){

        System.out.println("Guess a number between 0 to 20");

        int userChoice = sc.nextInt();

        if(userChoice>RandomNumber){

            System.out.println("Your Guess is too High");


        }else if(userChoice<RandomNumber){
            System.out.println("Your Guess is too low");
        }else {
            System.out.println("Gotch! you Guessed it Right");
        }
    }
    }
}





    