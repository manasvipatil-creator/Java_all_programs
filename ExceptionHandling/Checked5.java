import java.io.*;

public class Checked5 {

    public static void readFile() throws FileNotFoundException {

        FileReader fr= new FileReader("abc.txt");

        System.out.println("File Opened");
    }

    public static void main(String args[]){
        try {
            readFile();

        }
          catch(Exception e){
            System.out.println("File Not Found");
          }
    }
    
}
