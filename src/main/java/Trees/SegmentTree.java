package Trees;

import java.util.Arrays;

public class SegmentTree {

    private  class Node{
        int data;
        Node left;
        Node right;
        int startInterval;
        int endInterval;


        public Node(  int startInterval, int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }
    }

    private Node root;


    public SegmentTree(int[] arr){

        this.root= constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int[] arr, int start , int end){

        if(start==end){
            Node leaf = new Node(start, end);
            leaf.data=arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start+end)/2;
        node.left= this.constructTree(arr, start, mid);
        node.right=this.constructTree(arr, mid+1, end);

        node.data = node.left.data+node.right.data;
        return node;
    }


    private int query(Node node , int qsi , int qei){
        if(node.startInterval>= qsi && node.endInterval <= qei){
            return node.data;
        } else if (node.startInterval > qei && node.endInterval <qsi ) {
            return 0;
        }
        else{
            return this.query(node.left, qsi, qei)+this.query(node.right,qsi, qei);
        }
    }
}
