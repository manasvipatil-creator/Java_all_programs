abstract class Animal{
    abstract void bark();

    void display()
    {
        System.out.println("hello");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("hiii");
    }
}

 class Sai extends Dog{
    void manu(){
        System.out.println("hii11111");
    }
}