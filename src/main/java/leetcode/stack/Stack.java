package leetcode.stack;

public class Stack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T value) {
        if (top == capacity -1) {
            throw new IllegalArgumentException("stack overflow!");
        }
        stack[++top] = value;
    }

    public T pop() {
        if(isEmpty()) {
            throw new IllegalArgumentException("stack underflow!");
        }

        return stack[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("stack is empty");
        }

        return stack[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
