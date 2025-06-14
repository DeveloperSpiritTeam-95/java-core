package com.springboot.datastructuresandalgo.basicdsa;

public class LinkedListExample {

    /*
        Understanding Linked List Time Complexity in Detail

        A Linked List is a dynamic data structure where elements (nodes) are stored in
        separate memory locations and connected using pointers. It provides efficient
        insertion and deletion but has O(n) access time since elements are not stored
        contiguously.
    */

    // Dynamic size, unlike arrays.
    // Insertion/Deletion is O(1) at the beginning but O(n) at the end.
    // Random access is not possible (must traverse linearly).
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();  // Output: 10 -> 20 -> 30 -> null
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
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

    // Display Linked List
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}