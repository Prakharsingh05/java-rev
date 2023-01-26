
//Polymorphism
//An ability of an object to takee take many forms.
//Static / dynamic
//dynamicL: overriding (function)

public class Poly {
    
    //function overLoading : defining multiple function with same name with different parametes.
    //add is existing in multiple forms (using prameter)

    void add(int num1, int num){System.out.println((num1+num2):);}
    void add(int num1, int num2, int num3 ){System.out.println(num1+num2+num3);}
    void add(float num1, float num2 ){System.out.println(num1+num2);}
    void add(int num1, float num2 ){System.out.println(num1+num2);}
    void add(float num1,int num2) {System.out.println(num1+num2);}

    public static void main(String[] args){
        
        //rules

        //16/18 : no of parameters must be different
        //16/20 : no of parameter are same but it is valid becuaase type is different
        //22/24 : no of parameters are same and type are also same and type arre also almost same . its sequence of sata type

        Poly p = new Poly();
        p.add(12.2f, 300){

            
            
        }


    }






    
}

//Dynamic Polymorphism ; overriding

abstract class Doctors{

    abstract void treatPatient();

}

class Physician extends Doctor {

    @Override
    void treatPatient(){

        System.out.println("hi! I am Physican \n I treat pateints using Medicine");
        
}
class Surgeon extends Doctor{

        @Override
        void treatpateint(){
            System.out.println("hi! I am surgeon \n I treat pateints using Surgery");
     

        }

}

class dentist extends Doctor {

    @Override
     
    void treatPatient() {

        System.out.println("hi! I am Dentist \n I treat pateints using Teeth");
     
    }
}

public class Program
{
    public static void main(String args[])
    {
        System.out.println("Hi! I am Lucy! Receptioninist at Max Care");
        System.out.println("Who you are looking for?");
        System.out.println("Press 1. Physician \n 2. Surgeon\n3. Dentist");
        
        int choice = new java.util.Scanner(System.in).nextInt();
        Doctor doc;
        switch (choice)
        {
            case 1:
                doc = new Physician();
                break;
                
                case 2:
                    doc = new Surgeon();
                    break;
                    case 3:
                        doc = new Dentist();
                        break;
                        default : 
                        System.out.println("A Oh! Invalid Choice");
                        break;
        }
        if(choice<0 || choice>3)
        {
            System.exit(0);
        }
        else
        {
            doc.treatPatient();
        }
    }
}