import java.io.FileReader;

public class Checked2 {

    public static void main(String args[]){

        try{
            Thread.sleep(3000);

        }
        catch(Exception e){
            System.out.println("Exception occured");

        }

        System.out.println("Program End");

    }
    
}
