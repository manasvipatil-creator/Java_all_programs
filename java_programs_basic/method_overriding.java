class animal{
      void display(){

       System.out.println("animal ");

      }

}

class dog extends animal{

      void display(){

        System.out.println("Dog");
      }

}

public class method_overriding {

    public static void main(String[] args){

      animal am = new dog();
      am.display();

    }

}
