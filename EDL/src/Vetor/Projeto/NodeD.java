package Vetor.Projeto;

public class NodeD {
    private Object data;
    private NodeD next;
    private NodeD previous;

    public NodeD(Object data, NodeD next, NodeD previous){
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public NodeD getNext() {
        return next;
    }

    public void setNext(NodeD next) {
        this.next = next;
    }

    public NodeD getPrevious() {
        return previous;
    }

    public void setPrevious(NodeD previous) {
        this.previous = previous;
    }
}
