public class svariable {

    int a;
    String name;
    static String clg="dyp";


    svariable(int a, String name){
        this.a=a;
        this.name=name;


    }

    void display(){
        System.out.println(a+" "+ name+ " "+ clg);
    }


    public static void main(String[] args){

        svariable s1=new svariable(1,"manu");
        svariable s2 =new svariable(2,"vaishuu");

        s1.display();
        s2.display();

    }




}
