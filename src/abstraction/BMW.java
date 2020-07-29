package abstraction;

public class BMW extends Car {
    @Override
    public void transportPeople() {
//        super.transportPeople();
        System.out.println("BMW transport people. Unique to Vehicle, Car and BMW.");
    }

    @Override
    public void haveGPS() {
        System.out.println("BMW have GPS. Unique to Car and BMW");
    }
        public void canMove() {
        System.out.println("BMW can move. Unique to Vehicle and BMW.");
        super.canMove();
        transportGoods();
    }

    public void haveAutoParking() {
        System.out.println("BMW have auto parking. Unique to BMW.");
    }
}
