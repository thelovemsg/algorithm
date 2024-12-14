package leetcode.stack;

public class Queue<T> {
    private T[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(T value) {
        if(size == capacity) {
            throw new IllegalArgumentException("queue overflow!");
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("queue underflow!");
        }
        T value = queue[front];
        front = (front+1) % capacity;
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("큐가 비어 있습니다.");
        }

        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
