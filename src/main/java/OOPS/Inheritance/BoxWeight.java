package OOPS.Inheritance;

public class BoxWeight extends Box{


    int weight;

    public BoxWeight(){
        super();
        this.weight=-1;
    }

    public BoxWeight(int lenght , int width , int height , int weight){
        super(lenght, width, height);
        this.weight=weight;
    }

    public BoxWeight(int side , int weight){
        super(side);
        this.weight= weight;
    }


    public BoxWeight(BoxPrice other) {

        super(other);
        this.weight=other.weight;

    }
}
