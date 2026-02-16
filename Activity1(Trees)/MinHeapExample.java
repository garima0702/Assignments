//--------------Task 4 and 5------------------
//--------------Min heap using PriorityQueue------------------

import java.util.PriorityQueue;

public class MinHeapExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(2);
        minHeap.add(23);
        minHeap.add(45);
        minHeap.add(3);
        minHeap.add(30);
        minHeap.add(32);
        minHeap.add(15);


        System.out.print("\nSorted order: ");

        // Print in sorted order
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}