package practice;
public class unique_path {
    public static void main(String[] args) {
        int[][] grid={{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        System.out.println(uniquePathsIII(grid));
    }
    public static int uniquePathsIII(int[][] grid) {
        int row=0;
        int col=0;
        int zCount=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    row=i;
                    col=j;
                }
                if(grid[i][j]==0){
                    zCount++;
                }
            }
        }
        int [] ans=new int [1];
        int [] r={-1,0,1,0};
        int [] c={0,1,0,-1};
        check(grid,n,m,row,col,zCount,0,ans,r,c);
        return ans[0];
        
    }
    public static void check(int [][] grid,int n, int m,int row, int col,int zCount,int count,int [] ans, int[]r,int[]c){
        if(grid[row][col]==2){
            if(count==zCount){
                ans[0]++;
            }
            return;
            
        }
        grid [row][col]=-1;

        for(int i=0;i<4;i++){
            int nRow=row+r[i];
            int nCol=col+c[i];
            if(nRow>=0 && nRow<n  &&  nCol>=0 && nCol<m  && grid[nRow][nCol]>=0 && grid[nRow][nCol]!=1){
                if(grid[nRow][nCol] !=2) count+=1;
                check(grid,n,m,nRow,nCol,zCount,count,ans,r,c);
                if(grid[nRow][nCol] !=2) count-=1;   
            }
        }
        grid[row][col]=0;
    }
}
