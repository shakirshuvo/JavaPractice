package singleton;

public class SingletonDemo {
    // Singleton class: we are allowed to create one instance of a class at a time.
    // Using private constructor we can ensure that no more than one object can be created at a time.

    private int number;
    private String name;
    public String name1 = "Raza";

    private SingletonDemo() {
        this.number = 10;
        this.name = "Singleton Demo";
    }

    private static SingletonDemo instance = new SingletonDemo();

    public static SingletonDemo getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Do something.");
    }

}
