package Recursion;

public class Dice {
    public static void main(String[] args) {

        System.out.println(counter(0,4));
    }

    static int counter(int sum , int target){
        if(sum==target){
            return 1;
        }
        if(sum>target){
            return 0;
        }
        int count=0;
        for(int i =1;i<=6;i++){
            count = count + counter(sum+i,target);
        }
        return count;
    }
}
