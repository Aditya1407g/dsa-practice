package OOPS.Inheritance;

public class BoxPrice extends BoxWeight{

    int price;

    public BoxPrice(){
        super();
        this.price=-1;
    }

    public BoxPrice(int lenght, int width , int height , int weight , int price){
        super(lenght, width, height, weight);
        this.price=price;
    }

    public  BoxPrice(int side , int weight , int price){
        super(side , weight);
        this.price= price;
    }

    public BoxPrice(BoxPrice other){
        super(other);
        this.price= other.price;
    }
}
