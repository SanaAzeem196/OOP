// lab task 03//
// Name: Sana Azeem
// Roll no: SE231078

public class Car {
    String Color;
    String brand ;
    int Weight;
    String model;
    // method behaviour
    public void  brake(){
        System.out.println("Car is braking");

    }
    public void accelerate(){
        System.out.println("Car is accelerating");

    }
    public void turn()
    {
        System.out.println("Car is taking a turn");
    }

    //object creating
    public static void main(String[] args){
        Car car1 = new Car();
        car1.brand="Toyota";
        car1.Weight=200;
        car1.model="2024";
        car1.Color="white";
        System.out.println(car1.brand);
        System.out.println(car1.Weight);
        System.out.println(car1.Color);
        System.out.println(car1.model);
        car1.brake();
        car1.accelerate();
        car1.turn();
        Car car2 = new Car();
        car2.turn();
    }

}
