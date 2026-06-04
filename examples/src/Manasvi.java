public class Manasvi {
    Manasvi(String n ,int j){
        System.out.println("hello");

        }
    void manu(String name,int i){
        System.out.println("helllll");

    }

    void pratibha(Manasvi manasvi){
        System.out.println("hiiiii");
    }

    public static void main(String[] args){
        Manasvi m = new Manasvi("papa",1019);

        m.manu("manu",101);

        m.pratibha(m);
    }
}
