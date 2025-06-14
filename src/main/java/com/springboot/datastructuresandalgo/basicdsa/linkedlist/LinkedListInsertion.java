package com.springboot.datastructuresandalgo.basicdsa.linkedlist;

public class LinkedListInsertion {

    Node head;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // by default insertAtEnd above function
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {  // O(n) traversal
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at the Beginning (O(1))
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;  // O(1) operation
    }

    // Insert at a Specific Index (O(n))
    public void insertAtIndex(int data, int index) {
        if (index == 0) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Get element at index k (O(n) complexity)
    public int get(int index) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index)
                return temp.data;
            count++;
            temp = temp.next;
        }
        throw new IndexOutOfBoundsException("Index out of range");
    }

    // Time Complexity:
    // O(1) for inserting at the beginning
    // O(n) for inserting at the middle or end (traversal required)

    public static void main(String[] args) {
        LinkedListInsertion linkedListInsertion = new LinkedListInsertion();
        linkedListInsertion.insert(1);
        linkedListInsertion.insertAtEnd(2);
        linkedListInsertion.insertAtHead(3);
        linkedListInsertion.insertAtEnd(4);
        linkedListInsertion.insertAtIndex(5,4);
        linkedListInsertion.insertAtIndex(7,4);
        // linkedListInsertion.insertAtIndex(7,7); // Exception

        System.out.println("Element at index 0: " + linkedListInsertion.get(0));
        System.out.println("Element at index 1: " + linkedListInsertion.get(1));
        System.out.println("Element at index 2: " + linkedListInsertion.get(2));  // O(n) operation
        System.out.println("Element at index 3: " + linkedListInsertion.get(3));
        System.out.println("Element at index 4: " + linkedListInsertion.get(4));
        System.out.println("Element at index 5: " + linkedListInsertion.get(5));
    }
}
