package RestaurantOrders;

import java.util.*;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<String>();

        queue.offer("Order 4");
        queue.offer("Order 9");
        queue.offer("Order 13");
        queue.offer("Order 17");

        queue.poll();

        System.out.println("Element of queue -> " + queue.element());

        Iterator<String> it = queue.iterator();
        while(it.hasNext()) {
            System.out.println("PriorityQueue = " + it.next());
        }


        Queue<String> q = new LinkedList<>();
        q.add("a");
        q.add("b");
        q.add("c");

        q.element();

    }

}