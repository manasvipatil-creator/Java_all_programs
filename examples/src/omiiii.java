//parameterized constructor

public class omiiii {
    int a;
    String b;

    omiiii(int a ,String b){
        this.a=a;
        this.b=b;

        System.out.println("int a = " + a + " String b = " + b);

    }

    void manu(){
        System.out.println("hiiiii");
    }

    public static void main(String[] args){
        omiiii om =new omiiii(101,"Manu");
        om.manu();
    }
}
