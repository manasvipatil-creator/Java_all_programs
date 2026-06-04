public class Student1 {

    int id;
    String name;

     Student1(){
        this.id = 0;
        this.name= "manu";
    }

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String args[]){
        Student1 s1=new Student1();
        s1.display();
    }
}
