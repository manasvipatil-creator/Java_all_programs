import java.io.FileReader;

public record Checked1() {

    public static void main(String[] args){

        try{
            FileReader fr=new FileReader("abc.txt");
        }
        catch(Exception e){
            System.out.println("File not found");
        }
        System.out.println("Program End");
        }
    }
    

