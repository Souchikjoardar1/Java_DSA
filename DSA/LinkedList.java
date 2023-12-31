import java.util.*;

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

    public Node get(int index) {
        Node temp = head;
        if (index < 0 || index > length)
            return null;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {// to change the value of a particular node
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int value, int index) {// to insert a new node at a random position
        if (index < 0 || index > length)
            return false;
        if (index == 0) {// inserting at the first index
            prepend(value);
            return true;
        } else if (index == length) {// inserting at the last index
            append(value);
            return true;
        } else {
            Node newNode = new Node(value);
            Node temp = get(index);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;
        }
    }

    public Node remove(int index) {
        if (index < 0 || index > length)
            return null;
        if (index == 0)
            return removefirst();
        if (index == length - 1)
            return removeLast();
        else {
            Node prev = get(index - 1);// O(n)
            Node temp = prev.next;// this is O(1), didn't use the get method since it's O(n)
            prev.next = temp.next;
            temp.next = null;
            length--;
            return temp;// return the node removed
        }
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        Scanner in = new Scanner(System.in);
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
        System.out.println("enter an index to fetch the node ");
        int index = in.nextInt();
        System.out.println("the node at index " + index + " is: ");
        System.out.println(myLinkedList.get(index).value);
        System.out.println("enter the new value you want to set the previous value to at : " + index);
        int value = in.nextInt();
        if (myLinkedList.set(index, value)) {
            System.out.println("the new linked list is: ");
            myLinkedList.printList();
        } else
            System.out.println("NULL");
        System.out.println("enter the index where you would like to insert a new node in the LL : ");
        int index1 = in.nextInt();
        System.out.println("enter the value you would like to insert @ " + index1);
        int value1 = in.nextInt();
        if (myLinkedList.insert(value1, index1)) {
            System.out.println("linked list after insertion of a new node @ " + index1);
            myLinkedList.printList();
        } else
            System.out
                    .println("the index should exceed " + myLinkedList.length + " and should not be a negative number");
        System.out.println("enter the index of the node to be removed ");
        int index2 = in.nextInt();
        if (myLinkedList.remove(index2) != null) {
            System.out.println("the new linked list after removal :- ");
            myLinkedList.printList();
        } else
            System.out.println(
                    "the index should exceed " + myLinkedList.length + " and should not be a negative number");
    }
}
