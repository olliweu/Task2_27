package com.company;

public class DoubleLinkedList {

    private static class Node {
        Node next, prev;
        int value;

        public Node(Node prev, Node next, int value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    private Node head, tail;
    private int size = 0;

    public DoubleLinkedList() {
        head = tail = null;
    }

    public void addFirst(int value) {
        final Node currFirst = head;
        final Node newNode = new Node(null, currFirst, value);
        head = newNode;
        if(currFirst == null)  // if empty list
            tail = newNode;
        else
            currFirst.prev = newNode;
        size++;
    }

    public void addLast(int value) {
        final Node currLast = tail;
        final Node newNode = new Node(currLast, null, value);
        tail = newNode;
        if(currLast == null)  // if empty list
            head = newNode;
        else
            currLast.next = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return getNode(index).value;
    }

    private Node getNode(int index) {
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    public int getNext(int index) {
        return getNode(index).next.value;
    }

    public int getPrev(int index) {
        return getNode(index).prev.value;
    }

    public int getTail() {
        return tail.value;
    }

    public int getHead() {
        return head.value;
    }

}
