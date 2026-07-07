import java.io.*;

class Demo {

    static void read() throws FileNotFoundException {

        FileReader fr = new FileReader("abc.txt");

        System.out.println("A");
    }

    public static void main(String[] args) {

        try {

            System.out.println("B");

            read();

            System.out.println("C");

        }
        catch(FileNotFoundException e) {

            System.out.println("D");

        }

        System.out.println("E");
    }
}