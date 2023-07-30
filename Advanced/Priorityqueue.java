package Advanced;

import java.util.*;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        System.out.println("the priority queue uses min heap data structure " + pq);
        // the parent node/root node should always have the smaller value than the child
        // node
    }
}
