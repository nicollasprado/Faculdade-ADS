package Heap.FilaOrdenada;

public class Node {
    private Node left = null;
    private Node right = null;
    private Object data;

    public Node (Object data){
        this.data = data;
    }

    public Node(Node left, Node right, Object data) {
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
}
