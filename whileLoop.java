import java.util.*;
public class whileLoop {

    public static void main(String[] args){

        char ch='A'; //65
        while(ch<=90){
            System.out.print(ch+" ");
            ch++; //65+1
        }

        //do while
        char ch1='A';
        do{
            System.out.print(ch+" ");
            ch++;
        }while(ch<='Z');
    }
    
}
