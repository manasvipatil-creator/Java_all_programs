public class Static_Variable {
    // static int count = 110; // Static variable to keep track of the count    
    
    // public static void main(String[] args){
    //     System.out.println("Count: " + count); // Output: Count: 0
    // }


    static String college = "KRP college";
    String name;

    public static void main(String[] args){
                   
        Static_Variable s1 = new Static_Variable();
        Static_Variable s2= new Static_Variable();
        Static_Variable s3 = new Static_Variable();

        s1.name = "Manu";
        s2.name = "Rani";
        s3.name = "Vishu";

        System.out.println("College name = " + college);
        System.out.println("Student 1 name = " + s1.name);
        System.out.println("Student 2 name = " + s2.name);
        System.out.println("Student 3 name = " + s3.name + " " +Static_Variable.college); // Accessing static variable using class name);


    }
    



}
