public class hotel {

    int id;
    String cname;
    static String hotel_name= "Arun Dhaba";


    hotel(int id ,String c_name){

        this.id=id;
        this.cname=c_name;

    }

    void display(){
        System.out.println(id+ " "+cname+ " "+ hotel_name);
    }

    public static void main(String[] args){
        hotel h1=new hotel(1,"manuuu");
        hotel h2=new hotel(2,"vishuuuu");

        h1.display();
        h2.display();



    }


}
