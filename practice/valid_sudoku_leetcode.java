package practice;

public class valid_sudoku_leetcode {
public static void main(String[] args) {
    char[][] board = {
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };
    
    System.out.println(isValid(board));
}  
public static boolean isValidSudoku(char[][] board) {
    return isValid(board);
 }
 public static boolean isValid(char[][] board){
     for(int i=0;i<board.length;i++){
         for(int j=0;j<board[0].length;j++){
             if(board[i][j] != '.'){
                 char val=board[i][j];
                 board[i][j]='.';
                if(!(isPossible(board,val,i,j))){
                 return false;
                }
                board[i][j]=val;
             }
         }
     }
     return true;
 }
 public static boolean isPossible(char[][] board, char val,int row,int col){
     //check row;
     for(int c=0;c<board[0].length;c++){
         if(board[row][c]==val){
             return false;
         }
     }
     //check column
     for(int r=0;r<board.length;r++){
         if(board[r][col]==val){
             return false;
         }
     }
     //check matrix;
     int r= row - row%3;
     int c= col - col%3;
     for(int i=r;i<r+3;i++){
         for(int j=c;j<c+3;j++){
             if(board[i][j]==val){
                 return false;
             }
         }
     }
     return true;
 }

}

