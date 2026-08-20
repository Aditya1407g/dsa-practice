package Trees;

public class BinarySearchTrees {




    private class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;


        public Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }
    }


    private Node root;

    public BinarySearchTrees(){

    }

    public int height(Node node){
        if(node==null) return -1;

        return node.height;
    }

    public boolean isEmpty(Node node){
        return root==null;
    }


    public void insert(int value){
        root = insert(value, root);
    }




    private Node insert(int value, Node node){

        if(node ==null){
            node = new Node(value);
            return node;
        }

        if(value< node.getValue()){
            node.left=insert(value, node.left);
        }

        if(value>node.getValue()){
            node.right= insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right))+1;


        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }
    public void populate(int[] arr){
        for(int i =0;i<arr.length;i++){
            insert(arr[i]);
        }
    }

    public void display(){
        display(this.root, "Root node: ");
    }

    private void display(Node node, String details){
        if(node==null) return;

        System.out.println(details + node.getValue());
        display(node.left, "left child: ");
        display(node.right , "Right child: ");
    }






}
