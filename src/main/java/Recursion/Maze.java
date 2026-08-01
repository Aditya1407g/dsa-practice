package Recursion;

public class Maze {
    public static void main(String[] args) {
        pathFinder("", 4,4);
    }

    static void pathFinder(String p , int row , int col){
        if(row ==1 && col ==1){
            System.out.println(p);
            return;
        }

        if(col>1){
            pathFinder(p+"R", row, col-1);
        }
        if(row>1){
            pathFinder(p+"D", row-1, col);
        }
    }
}
