package abstraction;

public class Car extends Vehicle{
    @Override
    public void transportPeople(){
//        super.transportPeople();
        System.out.println("Cars transport people. Unique to Vehicle, Car and BMW.");
    }
    @Override
    public void transportAnimals(){
        System.out.println("Cars transport animals. Unique to Vehicle and Car.");
    }
    public void haveGPS(){
        System.out.println("Cars have GPS. Unique to Car and BMW.");
    }
    public void haveWheels(){
        System.out.println("Cars have wheels. Unique to Car.");
    }
}
