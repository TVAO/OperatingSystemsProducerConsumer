package utilities;

import interfaces.IQueue;

/**
 * This class represents a a circular buffer that utilizes a circular queue as the underlying data structure to hold items.
 * The circular queue is a linear data structure that follows the FIFO principle.
 * The last node is connected back to the first node to make a circle.
 * Elements are added at the rear end and the elements are deleted at front end of the queue.
 */
public class CircularQueue implements IQueue {

    private int rear,front;
    private int capacity;
    private int currentSize;
    private Object[] buffer;

    // Initialize buffer item with specified buffer size
    public CircularQueue(int size)
    {
        if(size <= 0) { throw new IllegalArgumentException("Size must be greater than 0"); }
        this.buffer = new Object[size];
        this.capacity = size;
        this.front = 0;
        this.rear = 0;
        this.currentSize = 0;
    }

    /**
     * Returns true if the queue is empty.
     * @return true if empty.
     */
    public boolean isEmpty(){
        return currentSize == 0;
    }

    /**
     * Returns the size of the buffer queue.
     * @return buffer size.
     */
    public int size(){
        return currentSize;
    }

    /**
     * Returns true if queue is full.
     * @return true if full.
     */
    public boolean isFull(){
        return (currentSize == capacity);
    }

    /**
     * Adds new item to queue if not full.
     * @param item to insert.
     */
    public void enqueue(Object item)
    {
        if (isFull()) { throw new ArrayStoreException("buffer is full"); }
        buffer[rear] = item; // Put item in the rear of the queue
        rear = (rear + 1) % capacity; // Increment rear queue position
        currentSize = currentSize + 1;
    }


    /**
     * Removes item from queue if not empty and return it.
     * @return item removed.
     */
    public Object dequeue()
    {
        if (isEmpty()) { throw new ArrayStoreException("Buffer is empty"); }
        Object toReturn = buffer[front];
        buffer[front] = null;
        front = (front + 1) % capacity; // Increment front queue position
        currentSize = currentSize - 1;

        return toReturn;
    }

}
