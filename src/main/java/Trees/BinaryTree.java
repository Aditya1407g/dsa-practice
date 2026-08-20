package Trees;

import java.util.Scanner;

public class BinaryTree {


    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
        public Node root;
        public void populate(Scanner scanner){
            System.out.println("Enter the root node");
            root = new Node(scanner.nextInt());
            populate(scanner , root);
        }

        public void populate(Scanner scanner, Node node){

            System.out.println("Do you want left of the value" + node.value);
            boolean left = scanner.nextBoolean();
            if(left){
                System.out.println("enter the value to the left of the " + node.value);
                int value = scanner.nextInt();
                node.left = new Node(value);
                populate(scanner,node.left);
            }

            System.out.println("Do you want to insert at the right of " + node.value);
            boolean right = scanner.nextBoolean();
            if(right){
                System.out.println("Enter the value to be inserted at the right of" +node.value);
                int value = scanner.nextInt();
                node.right= new Node(value);
                populate(scanner, node.right);
            }
        }

        public void display(){

            display(this.root, " ");
        }

        private  void display(Node node , String indent){
            if(node == null){
                return;
            }
            System.out.println(node.value + indent);
            display(node.left, indent+ "\t");
            display(node.right, indent+ "\t");
        }
        public void preOrder(){
            preOrder(root);
        }

        private void preOrder(Node node){
            if(node == null){
                return;
            }

            System.out.println(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }





}
