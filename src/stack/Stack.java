package stack;

import node.Node;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 21-07-2021
 * Time: 09:24
 */

public class Stack {
    private Node top;
    private int length;



    public int length() {
        return length;
    }


    public boolean isEmpty () {
        return length == 0;
    }


    public void push(int data) {
        Node newNode = new Node(data);

        if(isEmpty()) {
            top = newNode;
            return;
        }

        newNode.setNext(top);
        top = newNode;
    }

    public void peek () {
        if(isEmpty()) {
            System.out.println("Your stack is empty.");
            return;
        }
        System.out.println("Element at the top of the stack: " + top.getData());
    }

    public void pop () {
        if(isEmpty()) {
            System.out.println("Your stack is empty.");
            return;
        }
        Node tempTop = top.getNext();
        top = tempTop;
    }



}
