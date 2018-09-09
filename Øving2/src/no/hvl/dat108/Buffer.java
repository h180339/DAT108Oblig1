package no.hvl.dat108;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

/**
 * A shared buffer for consumers and producers. The item type is int. The buffer
 * is implemented by using a double ended queue.
 *
 * @author Atle Geitung
 * @version 17.05.2018 C++ version
 * @version 30.08.2018 Java version
 */
public class Buffer {

    private final static int SIZE = 10;
    private LinkedList<Integer> buffer = new LinkedList<>();
    private Semaphore sem;

    public Buffer() {
        sem = new Semaphore(0);
    }
    /**
     * Add a new item to the buffer. If the buffer is full, wait.
     *
     * @param item the new item
     */
    public void add(Integer item) {
        try {
            while (true) {
                if (buffer.size() <= 10) {
                    buffer.add(item);
                    sem.release();
                }
                return;
            }
        }catch (Exception e) {
        }
    }

    /**
     * Remove next available item from the buffer. If the buffer is empty, wait.
     *
     * @return next item
     */
    public Integer remove() {
        try {
            while (true) {
                sem.acquire();
                Integer back = buffer.removeFirst();
                return back;
            }
        }catch (Exception e) {
            return -1;
        }
    }

}
