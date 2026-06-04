public class throwClass {
    public static void main(String[] args){
        int age=16;

        if (age < 18){
            throw new ArrayIndexOutOfBoundsException("Not eligible to vote");
        }
        System.out.println("Eligible");
    }
}