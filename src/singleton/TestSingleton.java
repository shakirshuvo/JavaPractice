package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonDemo obj1 = SingletonDemo.getInstance();
        System.out.println(obj1.name1); // Raza
        obj1.doSomething();
        SingletonDemo obj2 = SingletonDemo.getInstance();
        System.out.println(obj2.name1); // Raza
        obj2.name1 = "Shakir";
        System.out.println(obj2.name1);
        System.out.println(obj1.name1);
        SingletonDemo2 singletonDemo2 = new SingletonDemo2();
        System.out.println(singletonDemo2.name3);
        SingletonDemo2 singletonDemo3 = new SingletonDemo2();
        System.out.println(singletonDemo3.name3);
        singletonDemo3.name3 = "Shakir";
        System.out.println(singletonDemo3.name3);
        System.out.println(singletonDemo2.name3);

    }


}
