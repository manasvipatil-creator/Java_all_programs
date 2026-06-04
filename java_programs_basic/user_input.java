import java.util.Scanner;

public class user_input {
    public static void main(String[] args){

        Byte a;
        Short b;
        Integer c;
        Long d;


        Scanner obj = new Scanner(System.in);

       
     


        System.out.println("Enter your choice for Byte:" );
         a = obj.nextByte();

        System.out.println("Enter your choice for Short:" );
         b = obj.nextShort();
        System.out.println("Enter your choice for Int:");
         c = obj.nextInt();
        System.out.println("Enter your choice for Long:");
         d = obj.nextLong();
    }
}
