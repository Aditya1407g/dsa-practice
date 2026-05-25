package bitwiseoperations;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,6,2,4};
        System.out.println(uniqueElement(arr));
    }
    static int uniqueElement(int[] arr){
        int finder=0;
        for(int x: arr)  finder ^= x;
        return finder;
    }
}
