package abstraction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestAbs {
    public static void main(String[] args) {
//        BMW bmw = new BMW();
//        bmw.canMove();

        Car car = new BMW();
        List myList = new ArrayList();
        car.haveWheels();
        car.haveGPS();
        car.transportPeople();
        car.transportAnimals();

//        List myList = new LinkedList();
        myList.add("Hi");
        myList.isEmpty();

        ArrayList myArrayList = new ArrayList();
        myArrayList.add("Hi");

        System.out.println("********************************");

        Vehicle vehicle1 = new Car();
        Car car1 = (Car) vehicle1;
        car1.haveWheels();
        car1.transportGoods();
        car1.transportAnimals();
        Car car2 = new Car();
        car2.haveWheels();
        BMW bmw = new BMW();
        bmw.canMove();
    }

}
