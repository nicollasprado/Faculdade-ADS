package Arvore.BinPesquisa;

public class AbpNode {
    private Object data;
    private AbpNode parent = null;
    private AbpNode left = null;
    private AbpNode right = null;


    public AbpNode(Object data, AbpNode parent) {
        this.data = data;
        this.parent = parent;
    }

    public AbpNode(Object data, AbpNode parent, AbpNode left, AbpNode right) {
        this.data = data;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public AbpNode getParent() {
        return parent;
    }

    public void setParent(AbpNode parent) {
        this.parent = parent;
    }

    public AbpNode getLeft() {
        return left;
    }

    public void setLeft(AbpNode left) {
        this.left = left;
    }

    public AbpNode getRight() {
        return right;
    }

    public void setRight(AbpNode right) {
        this.right = right;
    }
}
