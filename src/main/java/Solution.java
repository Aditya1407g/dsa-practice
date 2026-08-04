class Solution {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(board);

    }
    static  void solveSudoku(char[][] board) {
        recursion(board,0,0);
    }

    static void recursion(char[][] board, int row, int col){

        if(row==board.length&& col==board.length){
            return;
        }
        for(int i =col; i<board.length;i++){
            if(board[row][i]=='.'){
                for(int j=1;i<=9;j++){
                    char val = (char) (j + '0');
                    if(isSafe(board ,val , row, col)){
                        board[row][col]= val;
                        if(i==board.length-1){
                            recursion(board, row+1,0);
                        }
                        else recursion(board,row, i+1);
                        board[row][col]= '.';
                    }
                }
            }
            else if(i==board.length-1){
                recursion(board, row+1,0);
            }
        }


    }
    static boolean isSafe(char[][] board , char placer , int row , int col){
        for(int i =0;i<row ; i++){
            if(board[i][col]== placer) return false;
        }
        for(int i= row+1;i<board.length;i++){
            if(board[i][col]==placer) return false;
        }
        for(int i =0;i<col ; i++){
            if(board[row][i]== placer) return false;
        }
        for(int i= col+1;i<board.length;i++){
            if(board[row][i]==placer) return false;
        }
        return true;
    }
}