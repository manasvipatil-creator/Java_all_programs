public class sBlock {

    static int x;
    static String name;
    static {
        x=1000;
        name="manuu";
        System.out.println("ststic block exicuted");
        System.out.println(name);
        System.out.println(x);

    }

    public static void main(String[] args){
        System.out.println(x);
    }
}
