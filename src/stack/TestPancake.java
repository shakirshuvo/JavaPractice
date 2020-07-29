package stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class TestPancake {
    public static void main(String[] args) {

        StackDemo blueberryPancake = new StackDemo("Blueberry");
        StackDemo cocoPancake = new StackDemo("Chocolate");
        StackDemo strawberryPancake = new StackDemo("Strawberry");
        StackDemo vanillaPancake = new StackDemo("Blueberry");
        StackDemo blueraspberryPancake = new StackDemo("Blueraspberry");
        StackDemo bananaPancake = new StackDemo("Banana");


        Stack<StackDemo> pancakeStack = new Stack<>();
        pancakeStack.push(blueberryPancake);
        pancakeStack.push(cocoPancake);
        pancakeStack.push(strawberryPancake);
        pancakeStack.push(vanillaPancake);
        pancakeStack.push(blueraspberryPancake);
        pancakeStack.push(bananaPancake);

        StackDemo [] newPancakes = {bananaPancake, cocoPancake, strawberryPancake};
        String size = newPancakes.toString();

        for (int i = 0; (!size.isEmpty()); i++){
            System.out.println(pancakeStack.get(i).getFlavor());
        }


//        System.out.println("The pancake at the very top is "+ pancakeStack.peek().getFlavor());
//        System.out.println(pancakeStack.search(blueraspberryPancake));

//        for (StackDemo myNewStack: pancakeStack) {
//            System.out.println(myNewStack);
//
//        }
        System.out.println("*****************************");
for (int i = 0; i<pancakeStack.size(); i++){
    System.out.println(pancakeStack.get(i).getFlavor());
}


        System.out.println("*****************************");

    }

}