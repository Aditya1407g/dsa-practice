package LinkedList;

public class CLL {


    private Node head;
    private Node tail;



    public void insert(int value){
        Node node = new Node(value);
        if(head==null ){
            head=node;
            tail=node;
            return;
        }
        node.next=head;
        tail.next=node;
        tail=node;
    }


    public void display(){
        Node node = head;
        do{
            System.out.print(node.value+ " -> ");
            node=node.next;

        }while (node!=head);
        System.out.println("END");
    }

    private class Node{

        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
    }
}
