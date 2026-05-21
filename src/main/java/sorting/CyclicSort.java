package sorting;
import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {

        int[] arr= {4,3,2,7,6,8,5,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i =0;
        while(i<arr.length-1){
            int correct = arr[i]-1;
            if(correct!=i){
                int temp = arr[i];
                arr[i]=arr[correct];
                arr[correct]= temp;
            }
            else i++;
        }
    }

}
