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

    public Node removeLast() {
        Node temp = head;
        Node pre = temp;
        if (length == 0) {
            return null;
        } else {
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newnode = new Node(value);
        if (length == 0) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        length++;
    }

    public Node removefirst() {
        Node temp = head;
        if (length == 0)// no nodes present
            return null;

        else {
            head = head.next;// more than one node
            temp.next = null;
            length--;
        }
        if (length == 0)// any one node present
            tail = null;// since tail still points to the node
        return temp;
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        System.out.println("the original linked list: ");
        myLinkedList.printList();
        System.out.println("the element removed is: ");
        System.out.println(myLinkedList.removeLast().value);
        System.out.println("the linked list after element removal : ");
        myLinkedList.printList();
        myLinkedList.prepend(6);
        System.out.println("the prepended linked list: ");
        myLinkedList.printList();
        System.out.println("the removed node is: ");
        System.out.println(myLinkedList.removefirst().value);
        System.out.println("the list after removal of first element");
        myLinkedList.printList();
    }
}
