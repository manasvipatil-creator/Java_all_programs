// class Animal{

//     int add (int a, int b){
      
//      return a+b;

       
//     }

//     int add (int a,int b,int c){

//         return a+ b + c;
//     }
// }

// public class polymorphism { 

//     public static void main(String[] args){
//         Animal a = new Animal();
//        System.out.println( a.add(3, 6));
//        System.out.println( a.add(5,7,8));


//     }

    
// }


class Area{
     int area(int side){

        return side* side;
     }
       
     int area(int length , int breadth){


        return length * breadth;
     }

}


public class polymorphism{


    public static void main(String[] args){


    Area a = new Area();

    System.out.println(a.area(5));
    System.out.println(a.area(3,4));
}
}


