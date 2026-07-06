
import java.util.*;
public class throw_ex {

    public static void main(String args[]){


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=sc.nextInt();


    if(num<0){
        throw new ArithmeticException("Negative number is not allowed");
        
    }else{
            System.out.println("Valis Number");
    }


}
    
}

