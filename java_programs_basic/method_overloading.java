class Animal{

void sum (int a, int b){
        System.out.println("sum="+ (a+b));
    }


    void sum(int a, int b, int c){

     

         System.out.println("sum="+ (a+b+c));
    
}
}


public class method_overloading {

    public static void main(String[] args){

             Animal am = new Animal();

        // System.out.println(am.sum(5,6));
        // System.out.println(am.sum(10,12,15));


        am.sum(5, 10);

        am.sum(10,12,15);
    }
    
}
