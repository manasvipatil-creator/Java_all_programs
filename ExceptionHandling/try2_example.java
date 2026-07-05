public class try2_example {

    public static void main(String args[]){
        try{
            int arr[]=new int[5];
            arr[0]=10;
            arr[1]=20;
            arr[2]=30;
            arr[3]=40;
            arr[4]=50;

            System.out.println("Element at index 4:"+arr[4]);

            System.out.println(arr[8]);
        
        }catch(Exception e){
            System.out.println("Array index is out of bounds");
        }
    }
    
}
