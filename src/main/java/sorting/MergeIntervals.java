package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        for(int i =1;i<intervals.length;i++){
            int[] next = intervals[i];
            if(next[0]<=current[1]){
                current[1]= Math.max(current[1],next[1]);
            }
            else{
                result.add(current);
                current= next;
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);

    }
    public static void main(String[] args) {
        MergeIntervals sol = new MergeIntervals();

        int[][] test1 = {{1,3}, {2,6}, {8,10}, {15,18}};
        System.out.println(Arrays.deepToString(sol.merge(test1)));
        // expect [[1,6], [8,10], [15,18]]

        int[][] test2 = {{1,4}, {4,5}};
        System.out.println(Arrays.deepToString(sol.merge(test2)));
        // expect [[1,5]]

        int[][] test3 = {{1,4}, {2,3}};
        System.out.println(Arrays.deepToString(sol.merge(test3)));
        // expect [[1,4]]

        int[][] test4 = {{1,5}, {3,8}, {6,10}};
        System.out.println(Arrays.deepToString(sol.merge(test4)));
        // expect [[1,10]]
    }
}
