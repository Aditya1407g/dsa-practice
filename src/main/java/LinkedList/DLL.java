package LinkedList;

public class DLL {

    private Node head;
    private Node tail;

    private int size ;

    public DLL(){
        this.size=0;
    }



    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        node.previous=null;
        if(head!=null){
            head.previous=node;

        }
        if(tail==null){
            tail=node;
        }
        head=node;
        size++;

    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(tail==null){
            insertFirst(value);
            return;
        }
        node.previous=tail;
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertAtIndex(int index, int value){
        if(index==0) {
            insertFirst(value);
            return;
        }
        if(index==size-1){
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node temp = get(index-1);
        node.next=temp.next;
        temp.next.previous=node;
        node.previous=temp;
        temp.next=node;
        size++;



    }


    private Node get(int index){
        Node temp = head;

        for(int i =0;i<index;i++){
            temp= temp.next;
        }
        return temp;
    }


    public void dispaly(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void dispalyReverse(){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.previous;
        }
        System.out.println("END");
    }






    private class Node{

        int value;
        Node next;
        Node previous;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node previous, Node next){
            this.value=value;
            this.next=next;
            this.previous=previous;
        }
    }
}
