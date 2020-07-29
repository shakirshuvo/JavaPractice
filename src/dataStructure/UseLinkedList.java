package dataStructure;

import java.util.LinkedList;

public class UseLinkedList {
    public static void main(String[] args) {

        LinkedList<Character> characterLinkedList = new LinkedList<Character>();

        characterLinkedList.add('S');
        characterLinkedList.add('C');
        characterLinkedList.add('H');
        characterLinkedList.add('O');
        characterLinkedList.add('O');
        characterLinkedList.add('L');

        System.out.println(characterLinkedList);

        for (Character school: characterLinkedList) {
            System.out.println(school);
        }

        characterLinkedList.remove(2);
        System.out.println(characterLinkedList);
        characterLinkedList.add(2,'H');
        System.out.println(characterLinkedList);
        System.out.println(characterLinkedList.size());
    }

}
