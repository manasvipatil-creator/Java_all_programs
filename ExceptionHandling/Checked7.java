import java.io.*;


public class Checked7 {

     static void openFile() throws FileNotFoundException{
        FileReader fr=new FileReader("abc.txt");
        System.out.println("File Opened");
    }
  
    public static void main(String args[]){
    try{
        openFile();
        System.out.println("File opened successfully");
        
    }catch(Exception e){
        System.out.println("File not Found");
    }
    
}
}
