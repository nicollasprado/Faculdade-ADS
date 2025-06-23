package Arvore.BinPesquisa;

public class ABinPesquisa {
    private AbpNode root;
    private int size = 1;

    public ABinPesquisa(AbpNode root){
        this.root = root;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isRoot(AbpNode node){
        return node == root;
    }

    public boolean isInternal(AbpNode node){
        return node.getLeft() != null || node.getRight() != null;
    }

    public boolean isExternal(AbpNode node){
        return node.getLeft() == null && node.getRight() == null;
    }

    public int depth(AbpNode node){
        if(node.getParent() == null){
            return 0;
        }else{
            return 1+depth(node.getParent());
        }
    }

    public AbpNode root(){
        return this.root;
    }

    private int countHeight(AbpNode actual){
        if(actual == null){
            return 0;
        }

        int countLeft = 0, countRight = 0;
        countLeft += countHeight(actual.getLeft());
        countRight += countHeight(actual.getRight());

        return Math.max(countLeft, countRight);
    }

    public int height(){
        return countHeight(root);
    }

    // using data as integer by now
    private AbpNode addPreOrder(AbpNode actualNode, int objective){
        Integer nodeData = (Integer) actualNode.getData();
        if(objective < nodeData){
            if(actualNode.getLeft() == null){
                AbpNode newNode = new AbpNode(objective, actualNode, null, null);
                actualNode.setLeft(newNode);
                return newNode;
            }

            addPreOrder(actualNode.getLeft(), objective);
        }else if(objective > nodeData){
            if(actualNode.getRight() == null){
                AbpNode newNode = new AbpNode(objective, actualNode, null, null);
                actualNode.setRight(newNode);
                return newNode;
            }

            addPreOrder(actualNode.getRight(), objective);
        }

        // this code will never reach this if theres no equal numbers, just a placeholder
        return new AbpNode(objective, null, null, null);
    }

    public AbpNode add(Object data){
        return addPreOrder(root, (Integer) data);
    }

    private AbpNode findMin(AbpNode start){
        if(start.getLeft() == null) return start;
        findMin(start.getLeft());
        return null;
    }

    // todo
    public void remove(AbpNode node){
        AbpNode parent = node.getParent();
        AbpNode left = node.getLeft();
        AbpNode right = node.getRight();
        AbpNode sucessor = findMin(right);

        AbpNode parentLeft = parent.getLeft();
        if(parentLeft == node){
            parent.setLeft(sucessor);
            left.setParent(sucessor);
            sucessor.getParent().setLeft(null);
        }
    }
}
