package day25inheritance;



public class Car extends Vehicle {
    public int price=11000;
    public void engine(){

        System.out.println("Vehicle engine..");
    }
    public Car(){
        this("myaraba");

        System.out.println("Car 1");
    }

    public Car(String make){
        super(20000);

        System.out.println("Car 2: " + make);
    }

}

