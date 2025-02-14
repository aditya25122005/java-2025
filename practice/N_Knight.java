package practice;
import java.util.*;
public class N_Knight {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean [][] board=new boolean[n][n];
        solution(board,n,"",0,0);
        System.out.print("\n"+count);
    }
    static int count=0;
    public static void solution(boolean[][] board,int tk,String ans,int row, int col){
        if(tk==0){
            System.out.print(ans+" ");
            count++;
            return;
        }
        if(row>=board.length){
            return;
        }

        for(int i=row;i<board.length;i++){
            for(int j=(i==row)? col: 0;j<board[0].length;j++){
                if(isSafe(board,i,j)){
                    board[i][j]=true;
                    solution(board,tk-1,ans+"{"+i+"-"+j+"} ",i,j+1);
                     board[i][j]=false;

                }

            }
        }
    }
    public static boolean isSafe(boolean[][]board, int row, int col){
        int [][] moves= {{-2,-1},{-2,1},{-1,-2},{-1,2},{2,-1},{2,1},{1,-2},{1,2}};
        for(int [] nums:moves){
            int nRow= row+ nums[0];
            int nCol= col+ nums[1];
            if(nRow>=0 && nRow<board.length && nCol>=0 && nCol<board.length){
                if(board[nRow][nCol]==true){
                    return false;
                }
            }
        }
        return true;
    }
}
