package misc.datastructures;

/**
 * Priority Queue (using array based Heap data structure)
 */
public class PriorityQueue {
    private int [] values;
    private int tail;

    public PriorityQueue() {
        this(1000);
    }
    public PriorityQueue(int capacity) {
        values = new int[capacity+1];
        tail = 1;
    }

    public PriorityQueue insert(int v) {
        values[tail] = v;
        bubbleUp(tail);
        tail++;
        return this;
    }

    public int extractMin() {
        if (tail <= 1) {
            throw new RuntimeException("Empty Priority Queue");
        }

        int min = values[1];
        values[1] = values[tail - 1];
        values[tail - 1] = 0;
        tail--;
        if (tail > 1) {
            bubbleDown(1);
        }
        return min;
    }

    private void bubbleUp(int index) {
        for (int parentIdx = index / 2; (index > 1) && (values[parentIdx] > values[index]); parentIdx = index / 2) {
            if (values[parentIdx] > values[index]) {
                swap(parentIdx, index);
                index = parentIdx;
            }
        }
    }

    private void bubbleDown(int parent) {
        int left = parent * 2;
        int right = (parent * 2) + 1;
        int minIdx = parent;

        minIdx = (left < tail && values[left] < values[parent])? left : minIdx;
        minIdx = (right < tail && values[right] < values[minIdx])? right : minIdx;

        if (minIdx != parent) {
            swap(minIdx, parent);
            bubbleDown(minIdx);
        }
    }

    private void swap(int a, int b) {
        int t = values[a];
        values[a] = values[b];
        values[b] = t;
    }

}
