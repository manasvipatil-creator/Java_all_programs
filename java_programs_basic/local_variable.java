public class local_variable {

    // public static void main(String[] args){

    // int a = 20; // local variable
    // int b = 30; // local variable

    // int sum = a + b ;
    //  System.out.println("Sum =" + sum);  
    // }  



    // void display(){            //

    //     int num= 50; // loacl variable
    //     System.out.println("Number = " + num);
    // }

    // public static void main(String[] args){
    //   local_variable d = new local_variable();  //Object always created using class name
    //   d.display();



    // }
       
          void Student(){
           int rollNo = 101;
           String name = "manu";

           System.out.println("Roll No =" + rollNo);
           System.out.println("Student name is =" + name);


          }

        //   public static void main (String[] args){

        //     local_variable  s = new local_variable();  //Object always created using class name
        //     s.Student();
        //   }



          void Employee(){
           int emp_id=101;
           String name = "manu";
           int salary = 50000;
                System.out.println("Employee ID =" + emp_id);
                System.out.println("Employee name is ="+ name);
                System.out.println("Employee salary =" + salary);

          }

          public static void main(String[] args){

            local_variable e = new local_variable();
            e.Employee();

              local_variable  s = new local_variable();  //Object always created using class name
          s.Student();
          }



}
