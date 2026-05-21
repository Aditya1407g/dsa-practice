package searching;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {

        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(matrix,4)));
    }
    //search in the row provided between the colums
    static int[] binarySearch(int[][] matrix, int target, int row, int colstart, int colend){
        while(colstart<=colend){
            int mid = colstart+(colend-colstart)/2;
            if(matrix[row][mid]==target)  return new int[]{row, mid};
            if(matrix[row][mid]<target)  colstart=mid+1;
            else colend=mid-1;
        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int col = matrix[0].length;

        if(rows==1){
            return binarySearch(matrix,target,0,0,col-1);
        }
        //run the loop till 2 rows are remianing
        int rstart= 0;
        int rend= rows-1;
        int cmid=col/2;

        while(rstart<(rend-1)){

            int mid = rstart+(rend-rstart)/2;
            if(matrix[mid][cmid]==target)  return new int[]{mid,cmid};

            if(matrix[mid][cmid]>target)  rend=mid;
            else rstart=mid;
        }
        // now we have 2 rows
        //chech weather the targets lies in 2 colums of 2 ros

        if(matrix[rstart][cmid]==target)  return new int[] {rstart,cmid};
        if(matrix[rstart+1][cmid]==target)   return new int[] {rstart+1, cmid};

        //if target not found search in all 4 halves
        //search in first half
        if(target<=matrix[rstart][cmid-1]){

            return binarySearch(matrix, target, rstart,0,cmid-1);
        }
        //search in 2nd half
        if(target>=matrix[rstart][cmid+1] && target<=matrix[rstart][col-1]){
            return binarySearch(matrix, target, rstart,cmid+1,col-1);

        }
        //search in 3rd half
        if(target<=matrix[rstart+1][cmid-1]){
            return binarySearch(matrix, target, rstart+1,0,cmid-1);

        }
        //search in 4th half
        else{
        return  binarySearch(matrix, target, rstart+1,cmid+1,col-1);}

    }
}
