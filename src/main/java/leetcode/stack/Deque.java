package leetcode.stack;

public class Deque<T> {
    private T[] deque;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Deque(int capacity) {
        this.capacity = capacity;
        deque = (T[]) new Object[capacity];
        front = 0;
        rear = capacity-1;
        size = 0;
    }

    public void addFirst(T value) {
        if (size == capacity) {
            throw new IllegalStateException("dequeue overflow!");
        }

        front = (front - 1 + capacity) % capacity;
        deque[front] = value;
        size++;
    }

    public void addLast(T value) {
        if(size == capacity) {
            throw new IllegalStateException("deque overflow!");
        }

        rear = (rear+1) % capacity;
        deque[rear] = value;
        size++;
    }

    public T removeFirst() {
        if(size == capacity)
            throw new IllegalStateException("deque is full!");
        T value = deque[front];
        deque[front] = null;
        front = (front +1)  % capacity;
        size--;
        return value;
    }

    public T removeLast() {
        if (size == 0) {
            throw new IllegalStateException("deque is empty!");
        }

        T value = deque[rear];
        deque[rear] = null;
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // size: 현재 데크 크기 반환
    public int size() {
        return size;
    }

}
