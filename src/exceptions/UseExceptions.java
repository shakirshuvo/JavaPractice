package exceptions;

public class UseExceptions {
    public static void main(String[] args) {

        int num1 = 60;
        int num2 = 0;
        try {
            System.out.println(num1 / num2);

//        } catch (ArithmeticException ex) {
//            System.out.println(ex.getMessage());
//            System.out.println("Cannot divide by zero.");
        }finally {
            System.out.println("Finally block executed");
        }
        System.out.println("hello");
        System.out.println("car");
    }
}
