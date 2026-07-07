import java.io.*;

public class Checked6 {

    public static void main(String args[]){
        try{
            FileReader fr=new FileReader("abcd.txt");
            System.out.println("File Found");
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
    
}
