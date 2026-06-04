public class sclass {

    static  class inner{
        void display(){

            System.out.println("static inner class");
        }
    }

    public static void main(String[] args){
        sclass.inner obj=new sclass.inner();

        obj.display();



    }
}
