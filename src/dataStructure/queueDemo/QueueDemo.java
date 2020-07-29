package dataStructure.queueDemo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> ticketNumberQueue = new LinkedList<>();
        ticketNumberQueue.add(23);
        ticketNumberQueue.add(24);
        ticketNumberQueue.add(15);
        ticketNumberQueue.add(65);

        System.out.println(ticketNumberQueue);
        int firstTicktNum = ticketNumberQueue.peek();
        System.out.println(firstTicktNum);

        System.out.println(ticketNumberQueue.poll());
        System.out.println(ticketNumberQueue);

        PriorityQueue<Character> alphabetQueue = new PriorityQueue<>();
        alphabetQueue.add('B');
        alphabetQueue.add('U');
        alphabetQueue.add('C');
        alphabetQueue.add('K');
        alphabetQueue.add('S');

        for (Character myQueue: alphabetQueue) {
            System.out.println(myQueue);
    }
        System.out.println(alphabetQueue);
        alphabetQueue.poll();
        char firstElement = alphabetQueue.peek();
        System.out.println("First Element: "+firstElement);
        alphabetQueue.poll();

        for (Character myQueue: alphabetQueue) {
            System.out.println(myQueue);
        }

    }
}
