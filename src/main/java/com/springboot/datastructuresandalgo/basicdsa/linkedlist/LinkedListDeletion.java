package com.springboot.datastructuresandalgo.basicdsa.linkedlist;

public class LinkedListDeletion {

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

    public void deleteHead() {
        if (head == null) return;  // Empty list case
        head = head.next;  // O(1)
    }

    public void deleteTail() {
        if (head == null) return;  // Empty list case
        if (head.next == null) {  // Only one element case
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {  // O(n) traversal to second-last node
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtIndex(int index) {
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next == null) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        temp.next = temp.next.next;  // Bypass the deleted node
    }

    public static void main(String[] args) {

        LinkedListDeletion linkedListDeletion = new LinkedListDeletion();
        linkedListDeletion.insert(1);
        linkedListDeletion.insertAtEnd(2);
        linkedListDeletion.insertAtHead(3);
        linkedListDeletion.insertAtEnd(4);
        linkedListDeletion.insertAtIndex(5,4);
        linkedListDeletion.insertAtIndex(7,4);
        // linkedListInsertion.insertAtIndex(7,7); // Exception

        System.out.println("Element at index 0: " + linkedListDeletion.get(0));
        System.out.println("Element at index 1: " + linkedListDeletion.get(1));
        System.out.println("Element at index 2: " + linkedListDeletion.get(2));  // O(n) operation
        System.out.println("Element at index 3: " + linkedListDeletion.get(3));
        System.out.println("Element at index 4: " + linkedListDeletion.get(4));
        System.out.println("Element at index 5: " + linkedListDeletion.get(5));

        linkedListDeletion.deleteHead();
        System.out.println("Element at index 0: " + linkedListDeletion.get(0));
        linkedListDeletion.deleteTail();
        System.out.println("Element at index 3: " + linkedListDeletion.get(3));
    }

}
