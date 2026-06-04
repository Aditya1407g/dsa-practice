package searching;

public class ShipWithinDays {

    public int shipWithinDays(int[] weights, int days) {
        int start=0;
        for(int x:weights){
            start=Math.max(start,x);
        }
        int end = sumOf(weights);

        while(start<=end){
            int mid = start+(end-start)/2;
            if(allFit(weights,days,mid)){
                end=mid-1;
            }
            else start=mid+1;
        }
        return start;
    }
    static boolean allFit(int[] weights, int days, int perday){
        int count=1;
        int perweight=0;
        for(int x:weights){
            if(x+perweight>perday){
                count++;
                perweight=0;
            }
            perweight+=x;
        }
        if(count>days) return false;
        return true;
    }
    static int sumOf(int[] nums){
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        return sum;
    }

    public static void main(String[] args) {
        ShipWithinDays sol = new ShipWithinDays();

        System.out.println(sol.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));   // expect: 15
        System.out.println(sol.shipWithinDays(new int[]{3,2,2,4,1,4}, 3));             // expect: 6
        System.out.println(sol.shipWithinDays(new int[]{1,2,3,1,1}, 4));               // expect: 3
        System.out.println(sol.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 1));   // expect: 55 (all in one day)
        System.out.println(sol.shipWithinDays(new int[]{5,5,5,5}, 4));                 // expect: 5
    }
}
