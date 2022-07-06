class MyCircularQueue {

    private int[] data;
    private int head;
    private int tail;
    private int size;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull() == true) {
            return false;
        }
        if (isEmpty() == true) {
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return head == -1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }
}



class Solution {
     public boolean isSubsequence(String s, String t) {
        // Use a hashset to store all input s
        // Go through a loop of input t and everytime it sees

        // Create a queue size of Input string s length
        MyCircularQueue queue = new MyCircularQueue(s.length());

        // This creates a FIFO queue
        for (char c : s.toCharArray()) {
            queue.enQueue(c);
        }

        // I am going to use for loop and if the head character matches one of the character in input t, then I am going to dequeue and check the new head with input t element.
        // If the queue is empty at the end, then I know that input s is subsequence of input t

        for (char d : t.toCharArray()) {
            if (queue.Front() == d) {
                queue.deQueue();
            }
        }

        if (queue.isEmpty()) {
            return true;
        }

        return false;
    }
}