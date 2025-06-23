package Arvore.Generica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class AGenerica {
    private AGenNode root;
    private int size = 1;

    public AGenerica(AGenNode root){
        this.root = root;
    }

    public AGenNode root(){
        return root;
    }

    public int size(){
        return size;
    }

    private void getAllNodes(AGenNode actual, ArrayList<AGenNode> list){
        ArrayList<AGenNode> childrens = actual.getChildrens();
        for(AGenNode children : childrens){
            list.add(children);
            getAllNodes(children, list);
        }
    }

    public Iterator<AGenNode> nodes(){
        ArrayList<AGenNode> nodes = new ArrayList<>();

        if(isEmpty()){
            throw new NoSuchElementException();
        }

        nodes.add(root);
        getAllNodes(root, nodes);
        return nodes.iterator();
    }

    public boolean isEmpty(){
        return root == null;
    }

    public boolean isInternal(AGenNode node){
        ArrayList<AGenNode> childrens = node.getChildrens();
        return !childrens.isEmpty();
    }

    public boolean isExternal(AGenNode node){
        ArrayList<AGenNode> childrens = node.getChildrens();
        return childrens.isEmpty();
    }

    public boolean isRoot(AGenNode node){
        return node == root;
    }

    public int depth(AGenNode node){
        if(isRoot(node)){
            return 0;
        }else{
            return 1+depth(node.getParent());
        }
    }

    private int countHeight(AGenNode actualNode){
        ArrayList<AGenNode> childrens = actualNode.getChildrens();

        if(childrens.isEmpty()){
            return 0;
        }

        int highestCount = 0;
        for(AGenNode node : childrens){
            int counter = 0;
            counter += 1+countHeight(node);
            if(counter > highestCount){
                highestCount = counter;
            }
        }

        return highestCount;
    }

    public int height(){
        return countHeight(root);
    }

    public AGenNode addNode(AGenNode parent, Object data){
        AGenNode newNode = new AGenNode(data, parent);
        if(parent == null){
            root = newNode;
        }else{
            parent.getChildrens().add(newNode);
        }

        size++;
        return newNode;
    }

    public void removeNode(AGenNode node){
        ArrayList<AGenNode> childrens = node.getChildrens();
        AGenNode parent = node.getParent();

        ArrayList<AGenNode> parentChildrens = parent.getChildrens();
        for(AGenNode children : childrens){
            children.setParent(parent);
            parentChildrens.add(children);
        }

        size--;
        parentChildrens.remove(node);
    }


    private void printRecursive(AGenNode actual){
        ArrayList<AGenNode> childrens = actual.getChildrens();


        StringBuilder line = new StringBuilder();
        for(int i = 0; i < childrens.size(); i++){
            AGenNode node = childrens.get(i);

            if(i > 0){
                int nodeDepth = depth(node);
                int treeHeight = height();
                int qtBlank = (treeHeight - nodeDepth);
                line.append(" ".repeat(qtBlank));
            }
            line.append(node.getData());

            if(i == childrens.size()-1){
                System.out.println(line);
                for(AGenNode children : childrens){
                    printRecursive(children);
                }
            }
        }
    }

    public void print(){
        StringBuilder parentLine = new StringBuilder();
        int nodeDepthP = depth(root);
        int treeHeightP = height();
        int qtBlankP = treeHeightP - nodeDepthP;
        parentLine.append(" ".repeat(qtBlankP));
        parentLine.append(root.getData());
        System.out.println(parentLine);

        printRecursive(root);
    }

}
