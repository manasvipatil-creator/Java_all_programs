import java.io.*;

public class Checked4 {

    public void openFile() throws FileNotFoundException{          //public ghetlyamule 
        FileReader fr = new FileReader("abc.txt");

    }

    public static void main(String args[]){

        Checked4 obj = new Checked4();                              //ethe object karaychi vel ali
        
        try{
           obj.openFile();                                           //obj . then filr name 

        }catch(Exception e){
            System.out.println("File not found");
        }
    }
    
}
