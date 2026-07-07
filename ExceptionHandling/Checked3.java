import java.io.FileReader;


public class Checked3 {

    public static void main(String args[]){
        try{

            FileReader fr=new FileReader("student.txt");

            System.out.println("File Found");
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
    }
    
}
