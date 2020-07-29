package abstraction3;

public class AbDemo {

    public static void main(String[] args) {

        Iphone11 iphone11 = new Iphone11();
        SamsungS10 samsungS10 = new SamsungS10();
        show(iphone11);
        show(samsungS10);
    }

    public static void show(Phone obj){
        obj.showConfig();
    }

//    public static void show(Iphone11 obj) {
//        obj.showConfig();
//    }
//
//    public static void show(SamsungS10 obj){
//        obj.showConfig();
//    }
}
