//try catch block

public class exceptionhandling {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can not divided by zero");
        }
    }
}
