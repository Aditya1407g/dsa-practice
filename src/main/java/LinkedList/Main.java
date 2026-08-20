package LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {



//        DLL list = new DLL();
//
//        list.insertFirst(10);
//        list.insertFirst(20);
//        list.insertFirst(30);
//        list.insertLast(40);
//        list.insertLast(50);
//        list.insertAtIndex(2,100);
//        list.dispaly();

        CLL list1= new CLL();

        list1.insert(10);
        list1.insert(20);
        list1.insert(30);
        list1.insert(40);
        list1.insert(50);
        list1.insert(60);
        list1.insert(70);
        list1.display();


        Stack<Integer> stack = new Stack<>();
        stack.pop();

        Deque<Integer> deque = new ArrayDeque<>();






    }
}
