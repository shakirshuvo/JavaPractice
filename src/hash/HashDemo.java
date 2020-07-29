package hash;

import java.util.*;

public class HashDemo {
    public static void main(String[] args) {
        HashSet<String> myHash = new HashSet<>();

        myHash.add("Johny");
        myHash.add("Raza");
        myHash.add("Mobin");
        myHash.add("Johny");

        Set<String> list = new TreeSet<>(myHash);
        System.out.println(list);
//        System.out.println(list.get(2));
        System.out.println(list.size());

        for (String a: list) {
            System.out.println(a);

        }

    }

}
