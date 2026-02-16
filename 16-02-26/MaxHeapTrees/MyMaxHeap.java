class MaxHeap {

    private int[] heap;
    private int size;
    private int capacity;

    MaxHeap(int capacity){
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    private int parent(int index){
        return (index - 1) / 2;
    }

    private int leftChild(int index){
        return 2 * index + 1;
    }

    private int rightChild(int index){
        return 2 * index + 2;
    }

    private void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Insert element
    public void insert(int value){
        if(size == capacity){
            System.out.println("Heap is full");
            return;
        }

        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    // Heapify Up (Fix here: use < for MaxHeap)
    private void heapifyUp(int index){
        while(index > 0 && heap[parent(index)] < heap[index]){
            swap(parent(index), index);
            index = parent(index);
        }
    }

    // Heapify Down (Fix here: use largest instead of smallest)
    private void heapifyDown(int index){
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if(left < size && heap[left] > heap[largest]){
            largest = left;
        }

        if(right < size && heap[right] > heap[largest]){
            largest = right;
        }

        if(largest != index){
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    // Remove maximum element
    public int extractMax(){
        if(size == 0){
            throw new RuntimeException("Heap is empty");
        }

        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);

        return max;
    }

    public int getMax(){
        if(size == 0){
            throw new RuntimeException("Heap is empty");
        }
        return heap[0];
    }

    public void printHeap(){
        for(int i = 0; i < size; i++){
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}


public class MyMaxHeap {
    public static void main(String[] args) {

        MaxHeap heap = new MaxHeap(10);

        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(2);
        heap.insert(15);

        System.out.println("Heap elements:");
        heap.printHeap();

        System.out.println("Maximum element: " + heap.getMax());

        System.out.println("Extracted Max: " + heap.extractMax());

        System.out.println("Heap after extraction:");
        heap.printHeap();
    }
}
