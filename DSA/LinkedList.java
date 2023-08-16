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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("length: " + length);

    }

    public void append(int value) {
        Node newnode = new Node(value);
        if (length == 0) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
        length++;
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
    }
}
