//parameterized constructor

public class Student{
    int id;

    protected Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String name;


    public void display(){
        System.out.println(id +" "+name);
    }

    public static void main(String[] args){
        Student s1=new Student(101,"manu");
        s1.display();
    }



}