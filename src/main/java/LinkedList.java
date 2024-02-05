public class LinkedList<T> implements List<T> {
    Node<T> head; // first node

    /**
     * Creates an empty linked list.
     */
    public LinkedList() {
        head = null;
    }

    @Override
    public int size() {
        int count = 0;
        Node<T> node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(
                    String.format("Index %d is out of bounds for list of size %d",
                            index, size()));
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;
    }

    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    private static class Node<T> {
        T value;
        Node<T> next; // nullable

        private Node(T value) {
            this.value = value;
            this.next = null;
        }
    }
}
