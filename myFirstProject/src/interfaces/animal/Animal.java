package interfaces.animal;

public interface Animal {

    public static final int MAX_AGE= 150;

    public abstract void eat();

    void sleep();

    public static void info(){
        System.out.println("This is an Animal interface.");
    }

    public default void run(int a,int b){
        this.eat();
        System.out.println("Animal is running.");
        System.out.println("sum:"+ (a+b));
    }


}
