package leetcode.list;

public class LinkedList<T> implements List<T> {

    /**
     * 데이터 저장을 하는 field와 다음 node를 가리키는 next가 필요
     */
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private int size;

    /**
     * 초기화시 head는 null이고 size는 0이다.
     */
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * 추가하길 원하는 값을 맨 뒤에 추가한다.
     */
    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        // 현재 값이 아무것도 없다면 새로운 node가 head가 된다.
        if (head == null) {
            head = newNode;
        } else {
            //head가 존재하면 마지막 노드까지 찾아서 맨 뒤의 노드에 새로운 노드를 next로 설정하면 연결된다.
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        //size 추가
        size++;
    }

    /**
     * 특정 index에 element를 넣는 경우
     */
    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index : " + index);
        }

        Node<T> newNode = new Node<>(element);

        //index == 0에 넣고 싶은 경우 head값만 교체
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            //head 가 아닌 경우
            //head에서부터 index위치가 어디인지 탐색
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            // node1 -> node2 -> node3 -> node3 에 2번째 index에 newNode : node77을 넣고싶다면?
            // 1번째 까지 탐색 => node2 가 current가 된다.
            // node2의 next가 이제 새로운 노드의 next가 된다.
            newNode.next = current.next;
            //현재 노드의 다음이 새로운 노드가 되면 끝!
            current.next = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index : " + index);
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index : " + index);
        }

        Node<T> removedNode;

        // 삭제하고자 하는 index가 0이 인 경우 현재 head를 head의 next로 변경하면 우리 의 관리에서 벗어난다 -> 삭제
        if (index == 0) {
            removedNode = head;
            head = head.next;
        } else {
            //head정보 찾음
            Node<T> current = head;
            //node1 -> node2 -> node3 -> node4 -> node5 에서 (size : 5) 에서 index 3번 (node4)를 삭제하고 싶다면
            //node3까지만 탐색한다.
            for (int i = 0; i < index-1; i++) {
                current = current.next;
            }
            // node3의 next(node4)를 removedNode로 선택
            removedNode = current.next;
            // node3의 next로 removedNode의 next(node5)로 선택하면 removeNode(node4)는 우리가 더이상 관리하지 않는다.
            current.next = removedNode.next;
        }

        size--;

        return removedNode.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
