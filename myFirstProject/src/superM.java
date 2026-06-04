public class superM {
    String name="Parent";
}

class Student3 extends superM{
    String name="Child";

    void display(){
        System.out.println(super.name);
        System.out.println(name);
    }

    public static void main(String[] args){
        Student3 s=new Student3();
        s.display();
    }
}
