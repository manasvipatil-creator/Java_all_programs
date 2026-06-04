//meathod overloading

public class Employee {
    public int sum(int x, int y){
        return(x+y);


    }

    public int sum(int a, int b, int c){
        return (a+ b+ c);
    }

    public double sum(double x,double y){
        return (x+y);
    }

    public static void main(String[] args){
        Employee e= new Employee();
        System.out.println(e.sum(10,11));
        System.out.println(e.sum(12,12));
        System.out.println(e.sum(10,10,10));
    }
}
