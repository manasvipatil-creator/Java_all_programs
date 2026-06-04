//Final Variable Inside Constructor

public class Studentv {

    final int rollNo;

    Studentv(int r){
        rollNo = r;           //must assign here

    }

    void display(){
        System.out.println("rollNo:"+rollNo);
    }

    public static void main(String[] args){
        Studentv s= new Studentv(101);
        s.display();
    }



}
