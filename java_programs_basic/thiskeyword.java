public class thiskeyword {

    int id;
    String name;

    thiskeyword(int id, String name ){

        this.id= id;
        this.name=name;

        System.out.println("heyy");

    }
    

    void manu(){
    System.out.println("id=" + id);
    System.out.println("Name="+ name);

    }


    public static void main(String[] args){
           
        thiskeyword th =new thiskeyword(1, "manaaaa");
        th.manu();
    }
    }