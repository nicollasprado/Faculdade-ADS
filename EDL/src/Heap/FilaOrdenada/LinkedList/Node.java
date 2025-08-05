package Heap.FilaOrdenada.LinkedList;

public class Node {
    private Node parent = null;
    private Node left = null;
    private Node right = null;
    private Object data;

    public Node (Object data){
        this.data = data;
    }

    public Node(Node parent) {
        this.parent = parent;
    }

    public Node(Node parent, Object data) {
        this.parent = parent;
        this.data = data;
    }

    public Node(Node parent, Node left, Node right, Object data) {
        this.parent = parent;
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
