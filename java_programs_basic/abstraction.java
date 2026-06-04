abstract class pratibha{

    abstract void manu();


}

class papa extends pratibha{

    void manu(){

        System.out.println("hiiiii");
    }
}


public class abstraction{
    public static void main(String args[]){

        papa p = new papa();

        p.manu();
        
    }
}