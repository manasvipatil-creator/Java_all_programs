public class multipleCatch {
    public static void main(String[] args){
        try{
            int arr[]= new int[5];
            arr[10]=50;
        }catch(ArithmeticException e) {
            System.out.println("Arithmetic Error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Error");
        }
        }
    }

