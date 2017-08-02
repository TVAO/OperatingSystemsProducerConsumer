package interfaces;

/**
 * Represents an interface implemented by the queue data structure used to store items in the bounded buffer.
 */
public interface IQueue {

    /**
     * Returns true if the queue is empty.
     * @return true if empty.
     */
    boolean isEmpty();

    /**
     * Returns the size of the buffer queue.
     * @return buffer size.
     */
    int size();

    /**
     * Returns true if queue is full.
     * @return true if full.
     */
    boolean isFull();
    /**
     * Adds new item to queue if not full.
     * @param item to insert.
     */
    void enqueue(Object item);


    /**
     * Removes item from queue if not empty and return it.
     * @return item removed.
     */
    Object dequeue();

}
