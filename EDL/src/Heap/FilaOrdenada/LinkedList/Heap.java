package Heap.FilaOrdenada.LinkedList;

import java.util.ArrayDeque;
import java.util.Queue;

public class Heap {
    private int size = 0;
    private Node root = null;
    private Node last = null;

    public Heap(){
    }

    private void preOrderPrint(Node node){
        System.out.print(node.getData() + ", ");
//        System.out.print("[" + node.getData() + " " + (node.getLeft() != null ? node.getLeft().getData() : null) + " - " + (node.getRight() != null ? node.getRight().getData() : null) + "], ");

        if(node.getLeft() != null) preOrderPrint(node.getLeft());
        if(node.getRight() != null) preOrderPrint(node.getRight());
    }

    public void print(){
        preOrderPrint(root);
        System.out.println();
    }

    private int compare(Object a, Object b){
        if(a instanceof Integer){
            int intA = (int) a;
            int intB = (int) b;

            int test = intA - intB;

            if(test > 1) return 1;
            if(test == 0) return 0;
            if(test < 0) return -1;
        }

        return -2;
    }

    public int size () {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Object min() {
        return root.getData();
    }

    private void upheap(){
        Node iter = last;

        while(iter != root){
            Node parent = iter.getParent();

            if(compare(iter.getData(), parent.getData()) == -1){
                Object aux = parent.getData();
                parent.setData(iter.getData());
                iter.setData(aux);

                iter = parent;
            }else{
                break;
            }
        }
    }

    private void getNewLastPos(){
        Node iter = last;
        boolean swaped = false;

        while(true){
            if(iter == root){
                if(iter.getLeft() == null){
                    last = new Node(root);
                    root.setLeft(last);
                    break;
                }

                if(iter.getRight() == null){
                    last = new Node(root);
                    root.setRight(last);
                    break;
                }

                iter = iter.getLeft();
                swaped = true;
            }

            if(swaped){
                if(iter.getLeft() == null){
                    last = new Node(iter);
                    iter.setLeft(last);
                    break;
                }else if(iter.getRight() == null){
                    last = new Node(iter);
                    iter.setRight(last);
                    break;
                }

                iter = iter.getLeft();
            }else{
                if(iter.getParent().getLeft() != null && iter.getParent().getLeft() == iter){
                    swaped = true;
                    Node parent = iter.getParent();
                    iter = iter.getParent().getRight();

                    if(iter == null){
                        last = new Node(parent);
                        parent.setRight(last);
                        break;
                    }
                }else{
                    iter = iter.getParent();
                }
            }
        }
    }

    public void insert(Object data){
        if(size == 0){
            root = new Node(data);
            last = new Node(root);
            root.setLeft(last);
        }else{
            last.setData(data);
            upheap();
            getNewLastPos();
        }

        this.size++;
    }

    private void downHeap(){
        Node iter = root;

        while(iter != null){
            Node left = iter.getLeft();
            Node right = iter.getRight();
            Node smallest = left;

            if(right == null && left == null) break;

            if(right != null && compare(left.getData(), right.getData()) != -1) smallest = right;

            if(compare(iter.getData(), smallest.getData()) != -1){
                Object aux = iter.getData();
                iter.setData(smallest.getData());
                smallest.setData(aux);

                iter = smallest;
            }else{
                break;
            }
        }

    }

    public void removeMin(){
        if(size == 0) throw new RuntimeException("Empty queue");

        Node newRoot = last;

        if(root.getLeft() != null && root.getLeft() != newRoot){
            root.getLeft().setParent(newRoot);
            newRoot.setLeft(root.getLeft());
        }

        if(root.getRight() != null && root.getRight() != newRoot){
            root.getRight().setParent(newRoot);
            newRoot.setRight(root.getRight());
        }

        if(last != root){
            Node newRootOldParent = newRoot.getParent();

            if(newRootOldParent.getLeft() != null && newRootOldParent.getLeft() == newRoot){
                newRootOldParent.setLeft(null);
            }else{
                newRootOldParent.setRight(null);
            }
        }

        newRoot.setParent(null);
        root = newRoot;

        downHeap();
    }
}
