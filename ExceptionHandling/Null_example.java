public class Null_example {

    public static void main(String args[]){

        String s=null;
        try{
            System.out.println("Lenth= "+s.length());

        }
        catch(NullPointerException e){
            System.out.println("This is null pointer exception");
        }
        finally{
            System.out.println("x");
        }
    }
    
}
