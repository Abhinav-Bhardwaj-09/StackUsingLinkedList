package node;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 21-07-2021
 * Time: 09:21
 */

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
