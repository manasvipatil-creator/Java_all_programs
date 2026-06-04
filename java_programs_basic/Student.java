public class Student{
    int rollno;
    String name;
    double marks;

    public void display(){
        System.out.println(rollno+ " "+name+ " "+marks);
    }

    public static void main(String args[]){
        Student s1=new Student();
        s1.rollno=101;
        s1.name="MANA";
        s1.marks=80;
        s1.display();
    }
}