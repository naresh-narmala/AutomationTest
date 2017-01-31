package com.automation;


/**
 * Created by nnarmala on 1/25/17.
 */
class Node {
    // reference to the next node in the chain, or null if there isn't one.
    Node next;

    // data carried by this node. could be of any type you need.
    Object data;

    // Node constructor
    public Node(Object dataValue) {
        next = null;
        data = dataValue;
    }

    // another Node constructor if we want to specify the node to point to.
    @SuppressWarnings("unused")
    public Node(Object dataValue, Node nextValue) {
        next = nextValue;
        data = dataValue;
    }

    // these methods should be self-explanatory
    public Object getData() {
        return data;
    }

    @SuppressWarnings("unused")
    public void setData(Object dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }

}//End of class Node


public class LinkedList {
    //private static int counter;
    private int counter;
    private Node head;

    // Default constructor
    public LinkedList() {

    }

    // appends the specified element to the end of this list.
    public void add(Object data) {

        // Initialize Node only incase of 1st element
        if (head == null) {
            head = new Node(data);
        }

        Node Temp = new Node(data);
        Node Current = head;

        // Let's check for NPE before iterate over Current
        if (Current != null) {

            // starting at the head node, crawl to the end of the list and then add element after last node
            while (Current.getNext() != null) {
                Current = Current.getNext();
            }

            // the last node's "next" reference set to our new node
            Current.setNext(Temp);
        }

        // increment the number of elements variable
        incrementCounter();
    }

    private int getCounter() {
        return counter;
    }

    private void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }


    // removes the element at the specified position in this list.
    public Object removeMiddleElement() {
        Node slow = head;
        Node fast = head;
        Node prev = null;
        int length = 0;
        while ((fast != null) && (fast.getNext() != null)) {

            fast = fast.getNext().getNext();
            prev = slow;
            slow = slow.getNext();
        }

        //Deleting middle element
        try {
            prev.setNext(slow.getNext());
        } catch (Exception e) {
            System.out.println("list is empty");

        }
        decrementCounter();
        return slow.getData();

    }

    // returns the number of elements in this list.
    public int size() {
        return getCounter();
    }

    public String toString() {
        String output = "";

        if (head != null) {
            Node Current = head.getNext();
            while (Current != null) {
                output += "[" + Current.getData().toString() + "]";
                Current = Current.getNext();
            }
        }
        return output;
    }
}





