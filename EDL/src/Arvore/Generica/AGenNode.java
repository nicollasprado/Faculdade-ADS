package Arvore.Generica;

import java.util.ArrayList;

public class AGenNode {
    private Object data;
    private ArrayList<AGenNode> childrens = new ArrayList<>();
    private AGenNode parent = null;

    public AGenNode(Object data, ArrayList<AGenNode> childrens, AGenNode parent) {
        this.data = data;
        this.childrens = childrens;
        this.parent = parent;
    }

    public AGenNode(Object data, ArrayList<AGenNode> childrens){
        this.data = data;
        this.childrens = childrens;
    }

    public AGenNode(Object data, AGenNode parent) {
        this.data = data;
        this.parent = parent;
    }

    public AGenNode(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ArrayList<AGenNode> getChildrens() {
        return childrens;
    }

    public void setChildrens(ArrayList<AGenNode> childrens) {
        this.childrens = childrens;
    }

    public AGenNode getParent() {
        return parent;
    }

    public void setParent(AGenNode parent) {
        this.parent = parent;
    }
}
