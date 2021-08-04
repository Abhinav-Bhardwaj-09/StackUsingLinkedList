package stack;

import node.Node;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 21-07-2021
 * Time: 09:24
 */

public class Stack {
    private Node topNode;
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
            topNode = newNode;
            return;
        }

        newNode.setNextNode(topNode);
        topNode = newNode;
    }



    // To view the top element of the stack
    public void peek () {
        if(isEmpty()) {
            System.out.println("Your stack is empty.");
            return;
        }
        System.out.println("Element at the top of the stack: " + topNode.getData());
    }


    // To remove one element from the top of the stack
    public void pop () {

        if(isEmpty()) {
            System.out.println("Your stack is already empty.");
            return;
        }

        Node tempTopNode = topNode.getNextNode();
        topNode = tempTopNode;
        length--;
    }



    // To display and pop every element
    public void popAll () {
        if(isEmpty()) {
            System.out.println("Your stack is already empty.");
            return;
        }
        else if(length == 1) {
            System.out.println("(Top) " + topNode + " (Bottom)");
            length--;
            topNode = null;
            return;
        }

        Node currentNode = topNode;
        System.out.print("(Top) ");
        while (currentNode != null) {
            System.out.print("--> " + currentNode);
            currentNode = currentNode.getNextNode();
        }
        System.out.println(" (Botttom)");
        topNode = null;
        length = 0;
    }
}