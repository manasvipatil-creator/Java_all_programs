//hirarchical inheritance


public class manasvi {
    public void method(){
        System.out.println("method 1");
    }
}
class pratik extends manasvi {
    void method1() {
        System.out.println("method 2");
    }
}

class pratibha extends manasvi{
    void method2(){
        System.out.println("method 3");
    }



    public static void main(String args[]) {

        pratibha p = new pratibha();
        p.method();
        p.method2();

        pratik p1=new pratik();
        p1.method1();
        p1.method();

    }
}
