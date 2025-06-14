package com.springboot.datastructuresandalgo.basicdsa.linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Access Time Complexity: O(n)
// Unlike arrays, Linked Lists do not provide direct access to elements using an index.

// To find an element at index i, we must traverse the list from the head.
// This takes O(n) time, where n is the number of elements.

public class LinkedListAccess {

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
    // Accessing the head node → O(1)
    // Accessing the middle or last node → O(n)

    // Time Complexity:
    // O(1) for inserting at the beginning
    // O(n) for inserting at the middle or end (traversal required)

    public static void main(String[] args) {
        LinkedListAccess list = new LinkedListAccess();
        list.insert(10);
        list.insertAtEnd(20);
        list.insertAtIndex(30,2);
        list.insertAtHead(40);
        list.insertAtIndex(7,4);

        System.out.println("Element at index 2: " + list.get(2));  // O(n) operation
    }

}
