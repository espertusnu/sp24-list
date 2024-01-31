public class LinkedListOfString {

    private static class Node {
        String value;
        Node next; // nullable

        private Node(String value) {
            this.value = value;
            this.next = null;
        }
    }
}
