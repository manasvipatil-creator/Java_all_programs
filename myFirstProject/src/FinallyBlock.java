public class FinallyBlock {
    public static void main(String[] args){
        try{
            int num=10/2;
            System.out.println(num);
        }catch(Exception e){
            System.out.println("Error Occured");
        }finally {
            System.out.println("Finally Block Always Executes");
        }
    }
}
