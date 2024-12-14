package leetcode.list;

public class DoubleLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addAt(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index : " + index);
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if(index == size) {
            addLast(data);
            return;
        }

        Node<T> newNode = new Node<>(data);
        Node<T> current = head;

        //node1 -> node2 -> node3 -> node4 -> node5 인 경우
        // node6을 index = 3인 위치에 넣고 싶다면?
        // index = 1 위치까지 가야한다.
        for(int i=0; i<index; i++) {
            current = current.next;
        }

        //현재 index의 위치를 newNode가 대체하므로,
        //현재 index가 새로운 노드의 next가 된다.
        //그리고 현재 index의 이전 node가 새 노드의prev가 된다.
        newNode.next = current;
        newNode.prev = current.prev;


        //node3의 이전(node2)의 다음 이 이제는 새로운 노드가 된다;
        current.prev.next = newNode;
        //node3의 이전노드는 이제 새로운 노드가 된다.
        current.prev = newNode;

        size++;
    }

    public T removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index : " + index);
        }

        Node<T> removeNode;

        if (index == 0) {
            removeNode = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // 리스트가 비게 된 경우
            }
        } else if (index == size - 1) {
            removeNode = tail;
            tail = tail.prev;
            tail.next = null;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            removeNode = current;
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size --;
        return removeNode.data;
    }

    public static void main(String[] args) {
        System.out.println("args = " + args);
    }
}
