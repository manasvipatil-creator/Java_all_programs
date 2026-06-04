public class smethod1 {

    static void display(){
        System.out.println("we dont create an object of method ,we directly put the method name ");




    }

    static class sum{

        void sumof(int a,int b){

            System.out.println(a+b);
        }
    }
    public static void main(String[] args){

        display();

        sum s=new sum();
        s.sumof(2,4);
    }
}
