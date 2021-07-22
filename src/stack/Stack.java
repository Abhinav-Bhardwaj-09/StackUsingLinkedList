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


    // To get the no. of elements in the stack
    public int length() {
        return length;
    }



    // To check whether the stack is empty or not
    public boolean isEmpty () {
        return length == 0;
    }



    // To insert new element in the stack
    public void push(int data) {
        Node newNode = new Node(data);
        length++;

        if(isEmpty()) {
            top = newNode;
            return;
        }

        newNode.setNext(top);
        top = newNode;
    }



    // To view the top element of the stack
    public void peek () {
        if(isEmpty()) {
            System.out.println("Your stack is empty.");
            return;
        }
        System.out.println("Element at the top of the stack: " + top.getData());
    }


    // To remove one element from the top of the stack
    public void pop () {

        if(isEmpty()) {
            System.out.println("Your stack is empty.");
            return;
        }

        Node tempTop = top.getNext();
        top = tempTop;
        length--;
    }

}
