package abstraction;

public class Vehicle {
    public void transportPeople(){
        System.out.println("Vehicles transport people. Unique to Vehicle, Car and BMW.");
    }
    public void transportAnimals(){
        System.out.println("Vehicles transport animals. Unique to Vehicle and Car.");
    }
    public void canMove(){
        System.out.println("Vehicle can move. Unique to Vehicle and BMW.");
    }
    public void transportGoods(){
        System.out.println("Vehicles transport goods. Unique to Vehicle.");
    }
}
