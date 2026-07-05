import java.util.Scanner;

class exception_scanner {
    public static void main(String[] args) {

        int a;
        int b;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number:");
        a= sc.nextInt();

        System.out.println("Enter the second number:");
        b=sc.nextInt();

        try{
            int c= a/b;
            System.out.println("The result of the division is:"+c);

        }catch(ArithmeticException e){
            System.out.println("This is an arithmetic exception");
        }
        





    }
}