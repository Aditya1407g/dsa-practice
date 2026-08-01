package OOPS.Inheritance;

public class Box {

    int height ;
    int width;
    int lenght;

    Box(){
        height=-1;
        width=-1;
        lenght=-1;
    }

    //fpr cube
     Box(int side){
        this.height=side;
        this.width=side;
        this.lenght=side;
     }

    // for cuboid
    Box(int height , int width , int length){
        this.height=height;
        this.width = width ;
        this.lenght=length;
    }

    Box(Box box){
        this.height= box.height;
        this.width= box.width;
        this.lenght = box.lenght;
    }
}
