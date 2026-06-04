public class NestedTryCatch {
    public static void main (String[] args){
        try{
            try {
                int a = 10 / 0;
            }catch (ArithmeticException e){
                System.out.println("Inner catch: Divided by zero");

            }
            int arr[] = new int[3];
            arr[6]=10;
            }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Outer catch: Array index error");
            }
        }
    }

