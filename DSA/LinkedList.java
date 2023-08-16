class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) { // initializing all variables
        Node newnode = new Node(value);
        head = newnode;// head points to the newnode
        tail = newnode;// tail points to the newnode
        length = 1;
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

    }
}
