package searching;

public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end = max(piles);
        while(start<=end){
            int mid = start+(end-start)/2;
            int count = 0;
            for(int x:piles){
                if(x%mid==0){
                    count += x/mid;
                }
                else{
                    count+= (x/mid)+1;
                }
            }
            if(count > h){
                start=mid+1;
            }
            else end= mid-1;
        }
        return start;
    }
    static int max(int[] arr){
        int max=arr[0];
        for(int x:arr){
            max = Math.max(max,x);
        }
        return max;
    }

    public static void main(String[] args) {
        KokoEatingBananas sol = new KokoEatingBananas();

        System.out.println(sol.minEatingSpeed(new int[]{3,6,7,11}, 8));        // expect: 4
        System.out.println(sol.minEatingSpeed(new int[]{30,11,23,4,20}, 5));   // expect: 30
        System.out.println(sol.minEatingSpeed(new int[]{30,11,23,4,20}, 6));   // expect: 23
        System.out.println(sol.minEatingSpeed(new int[]{1000000000}, 1));      // expect: 1000000000
    }
}