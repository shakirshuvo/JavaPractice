package useArray;

import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>(5);
        myList.add(32);
        myList.add(83);
        myList.add(84);
        myList.add(22);
        myList.add(19);
        myList.add(28);

        for (Integer i : myList)
            System.out.println(i);
        System.out.println("size =" + myList.size());
        myList.set(0, 100);

        for (Integer i : myList)
            System.out.println(i);
        System.out.println("New size = "+myList.size());
    }
}
