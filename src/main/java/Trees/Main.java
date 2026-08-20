package Trees;

import searching.BinarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from trees");

//
//        BinaryTree tree = new BinaryTree();
//        Scanner scanner = new Scanner(System.in);
//
//        tree.populate(scanner);
//        tree.display();


        int[] arr = {5,84,658,25,42,651,2};
        BinarySearchTrees tree = new BinarySearchTrees();

        tree.populate(arr);
        tree.display();





    }

}
