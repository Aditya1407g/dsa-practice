package sorting;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while(i <= nums.length-1){
            int correct = nums[i]-1;
            if(nums[i]!=correct && nums[correct] != correct+1){
                swap(nums,i,correct);
            }
            else i++;
        }
        ArrayList<Integer> rval = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                rval.add(j+1);
            }
        }
        return rval;
    }
    static void swap(int[] nums , int a , int b ){
        int temp = nums[a];
        nums[a]= nums[b];
        nums[b]= temp;
    }

    public static void main(String[] args) {
        FindDisappearedNumbers sol = new FindDisappearedNumbers();

        System.out.println(sol.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));   // expect: [5, 6]
        System.out.println(sol.findDisappearedNumbers(new int[]{1,1}));                // expect: [2]
        System.out.println(sol.findDisappearedNumbers(new int[]{1,2,3,4}));            // expect: []
        System.out.println(sol.findDisappearedNumbers(new int[]{2,2,2,2}));            // expect: [1, 3, 4]
    }
}