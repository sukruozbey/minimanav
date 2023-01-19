package day25inheritance;



public class Honda extends Car {
    public int price=10000;
    public void engine(){
        System.out.println("Vehicle engine..");
    }
    public Honda(){
        this("civic",2000);


        System.out.println("Honda 1");
    }

    public Honda(String model, int year){
        super();


        System.out.println("Honda 2: " + model + " - " + year);
    }



}
