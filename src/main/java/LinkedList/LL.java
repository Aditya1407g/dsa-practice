package LinkedList;

public class LL {


    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=node;
        }
        size++;

    }
    public void insertLast(int value){

        if(tail==null) {
            insertFirst(value);
            return;
        };
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertAtIndex(int index, int value){

        if(index<0 || size<index) {
            throw new IndexOutOfBoundsException( "Index: " + index + ", Size: " + size);
        }
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp=head;
        for(int i =1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next=node;
        size++;
    }


    public int deleteFirst(){
        int temp = head.value;
        head = head.next;
        if(head==null) tail= null;
        size--;
        return temp;
    }



    public int deleteLast(){
        if(head==tail){
            return deleteFirst();
        }
        int rval=tail.value;
        tail= get(size-2);
        tail.next=null;
        size--;
        return rval;

    }

    public int deleteAtIndex(int index){
        if(index==0) return deleteFirst();
        if(index==size) return deleteLast();
        Node pre= get(index-1);
        int rval = pre.next.value;
        pre.next=pre.next.next;
        size--;
        return rval;
    }
    public int getValueAtIndex(int index){
        Node node = get(index);
        return node.value;
    }

    public Node fine(int value){

        Node node = head;
        while(node.next!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for(int i =0;i<index;i++){
            node= node.next;
        }
        return node;
    }



    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }

        System.out.println("END");
    }


    private class Node{

        private int value;
        private Node next;


        public  Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }



}


