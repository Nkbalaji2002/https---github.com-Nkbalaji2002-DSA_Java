package linkedlists;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    private class ListNode {
        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    // Print Elements in Doubly Linked List using forward
    public void displayForward() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        }

        System.out.print("null \n");
    }

    // Print Elements in Doubly Linked List using backward
    public void displayBackward() {
        ListNode temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ---> ");
            temp = temp.previous;
        }

        System.out.print("null \n");
    }

    // insert the first node in Doubly Linked List
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);

        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }

    // insert the end node in Doubly Linked List
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }

        tail = newNode;
        length++;
    }

    // delete the first node in Doubly Linked List
    public ListNode DeleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode temp = head;

        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }

        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    // delete the last node in Doubly Linked List
    public ListNode DeleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode temp = tail;

        if (head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }

        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

    // main method
    public static void main(String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList();

        // System.out.println(myDoublyLinkedList.length());
        // myDoublyLinkedList.insertFirst(1);
        // myDoublyLinkedList.insertFirst(10);
        // myDoublyLinkedList.insertFirst(15);
        // myDoublyLinkedList.insertFirst(65);

        myDoublyLinkedList.insertLast(1);
        myDoublyLinkedList.insertLast(10);
        myDoublyLinkedList.insertLast(15);
        myDoublyLinkedList.insertLast(25);

        myDoublyLinkedList.displayForward();
        // myDoublyLinkedList.displayBackward();

        // myDoublyLinkedList.DeleteFirst();
        // myDoublyLinkedList.DeleteFirst();

        myDoublyLinkedList.DeleteLast();
        myDoublyLinkedList.DeleteLast();
        myDoublyLinkedList.DeleteLast();
        myDoublyLinkedList.DeleteLast();

        myDoublyLinkedList.displayForward();

    }
}
