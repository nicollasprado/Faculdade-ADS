package Heap.FilaOrdenada.LinkedList;

public class Heap {
    private int size = 0;
    private Node root = null;
    private Node last = null;

    public Heap(){
    }

    private void preOrderPrint(Node node){
//        System.out.print(node.getData() + ", ");
        System.out.print("[" + node.getData() + " " + (node.getLeft() != null ? node.getLeft().getData() : null) + " - " + (node.getRight() != null ? node.getRight().getData() : null) + "], ");

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

    //  TODO- ARRUMAR UPHEAP
    private void upheap(){
        Node iter = last;

        while(true){
            Node parent = iter.getParent();

            if(compare(iter.getData(), parent.getData()) == -1){
                if(parent.getLeft() != null){
                    iter.setLeft(parent.getLeft());
                }

                if(parent.getRight() != null){
                    iter.setRight(parent.getRight());
                }

                if(iter.getLeft() != null){
                    parent.setLeft(iter.getLeft());
                    iter.getLeft().setParent(parent);
                }

                if(iter.getRight() != null){
                    parent.setRight(iter.getRight());
                    iter.getRight().setParent(parent);
                }

                Node grandparent = parent.getParent();

                if(grandparent.getLeft() == parent){
                    grandparent.setLeft(iter);
                }

                if(grandparent.getRight() == parent){
                    grandparent.setRight(iter);
                }

                parent.setParent(iter);
                iter.setParent(grandparent);

                if(parent == root){
                    root = iter;
                    break;
                }

                if(iter == root) break;
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
                    last = new Node(root, 201);
                    root.setLeft(last);
                    break;
                }

                if(iter.getRight() == null){
                    last = new Node(root, 202);
                    root.setRight(last);
                    break;
                }

                iter = iter.getLeft();
                swaped = true;
            }

            if(swaped){
                if(iter.getLeft() == null){
                    last = new Node(iter, 203);
                    iter.setLeft(last);
                    break;
                }else if(iter.getRight() == null){
                    last = new Node(iter, 204);
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
                        last = new Node(parent, 205);
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
            last = new Node(root, 200);
            root.setLeft(last);
        }else{
            last.setData(data);
            upheap();
            getNewLastPos();
            if(last.getParent().getParent() != null) System.out.println(last.getData() + " " + last.getParent().getData() + " " + last.getParent().getParent().getData());
        }

        this.size++;
    }


    public void removeMin(){
        if(size == 1) throw new RuntimeException("Empty queue");

        System.out.println("to be implemented");
    }
}
