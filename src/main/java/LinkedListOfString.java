public class LinkedListOfString implements ListOfString {
    Node head; // first node

    /**
     * Creates an empty linked list.
     */
    public LinkedListOfString() {
        head = null;
    }

    @Override
    public int size() {
        int count = 0;
        Node node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(
                    String.format("Index %d is out of bounds for list of size %d",
                            index, size()));
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;
    }

    @Override
    public void add(String s) {
        Node newNode = new Node(s);
        if (head == null) {
            head = newNode;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    private static class Node {
        String value;
        Node next; // nullable

        private Node(String value) {
            this.value = value;
            this.next = null;
        }
    }
}
