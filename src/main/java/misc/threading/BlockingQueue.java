package misc.threading;

import java.util.ArrayList;
import java.util.List;

/**
 * A thread-safe FIFO queue with a size limit.
 * This is a subset of the BlockingQueue interface from Java 1.5.
 */
public class BlockingQueue {

    private List<String> buffer;
    private int back = 0;
    private int size;

    public BlockingQueue(int size) {
        this.buffer = new ArrayList<>();
        this.back = 0;
        this.size = size;

    }

    public synchronized String get() throws InterruptedException {
        while (this.buffer.size() == 0) {
            this.wait();
        }

        String elem = this.buffer.remove(0);
        this.notifyAll();
        return elem;
    }

    public synchronized void put(String elem) throws InterruptedException {
        while (this.buffer.size() >= this.size) {
            this.wait();
        }
    }

}
