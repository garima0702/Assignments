

import java.util.*;

public class TicketQueue {

    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");

        
        queue.poll();
        queue.poll();

        
        System.out.println("Remaining Queue: " + queue);
    }
}
