package com.company;

/*
@ author: Cavin Karema
This is an implementation of a singly linked list
--------------------------NOTE--------------------------------
To be added --> method to enable insertion of element at any given index
     --> add method addLast that add an element t at the tail of the list
     --> add removeFirst that removes the first element
 */

public class LinkedList<T> {
    // define a nested node instance
    private static class Node<T> {
        private T element;
        private Node<T> pointer;

        // create a constructor for the class
        public Node(T data, Node<T> next) {
            element = data;
            pointer = next;
        }

        // define the access and update methods for the class
        public T getElement() {
            return element;
        }

        public Node<T> getPointer() {
            return pointer;
        }

        public void setPointer(Node<T> n) {
            this.pointer = n;
        }
    }

    /*
    end of the nested node class instance
     */
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    // create a null constructor for the class
    public LinkedList() {
    }

    // access and update methods
    public boolean isEmpty() {
        return size == 0;
    }

    public T first() {   // returns (does not remove the first element in the list)
        if (isEmpty()) return null;
        return head.getElement();
    }

    public T last() {   // returns last element in the list (does not remove last element in the list)
        if (isEmpty()) return null;
        return tail.getElement();
    }


    // update methods
    public void addFirst(T t) {
        head = new Node<>(t, head);      // creating and linking a new node
        // ALWAYS account for the edge cases
        if (size == 0) {        // in this case, the linked list is empty
            tail = head;
            size++;
        }

    }

    public void addLast(T t) {
        Node<T> last = new Node<>(t, null);   // this new node will act as the tail
        // account for the edge case i.e when the list is empty
        if (isEmpty())
            head = last;
        else
            tail.setPointer(last);
        tail = last;
        size++;
    }

    public void removeFirst() {
    }

}


