package interfaces;

import interfaces.animal.Animal;
import interfaces.animal.Cat;
import interfaces.animal.Dog;
import interfaces.devices.SmartPhone;

public class Test {

    public static void main(String[] args){

//          Dog dog=new Dog();
//          Cat cat =new Cat();
//          dog.eat();
//
//        System.out.println(Dog.MAX_AGE);
//        System.out.println(Animal.MAX_AGE);
//
//        Animal.info();
//        dog.run(1,2);
//        cat.run(5,6);


        SmartPhone smartPhone=new SmartPhone();
        smartPhone.makeCall("9874647488");
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.stopMusic();
        smartPhone.takePhoto();
        smartPhone.recordVideo();

        }




    }


