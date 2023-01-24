
import java.util.*;

public class Encpsulation {

     public static  void main(String[] args){

        Amazon customer = new Amazon();
    
        float  payableAmount = customer.Transaction(1000);
        System.out.println(payableAmount);


     }
    
}

   class Amazon {
        float Transaction(float amt){
            GPay gpayObj = new GPay();

            gpayObj.setTxnCharge(0.07f);
            
            float totalAmount = amt + (amt * gpayObj.txnCharge);
            return totalAmount;
        }
   }
class GPay{

    private float txnCharge= 0.5f;
    public void setTxnCharge(float newCharge){
        txnCharge = newCharge; 
        if (newCharge<=0){
            System.out.println("Invalid TxtCharge");
            return;
        }
    }
    public float getTxnCharge(){
        return txnCharge;
    }
}
