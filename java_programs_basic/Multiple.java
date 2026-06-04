interface A{
    void display();
}

interface B{
    void show();
}

class C implements A, B{

    public void display(){
        System.out.println("Display method");
    }

    public void show(){
        System.out.println("Show method");
    }
}

public class Multiple{

    public static void main(String args[]){

        C obj = new C();

        obj.display();
        obj.show();
    }
}