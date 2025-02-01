package backtracking_lec2;
import java.util.Scanner;
public class RatChasesCheese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        char [][] maze=new char[N][M];
        for(int i=0;i<N;i++){
            String s=sc.next();
            for(int j=0;j<M;j++){
                maze[i][j]=s.charAt(j);
            }
        }
        
        int [] [] ans=new int[N][M];

        path(maze,0,0,ans);
        if(b==false){
            System.out.println("NO PATH FOUND");
        }
    }
    static boolean b=false;
    public static void path(char [][] maze,int cr,int cc,int[][] ans){
        if(cc<0 || cr<0 || cc>maze[0].length-1 || cr>maze.length-1 || maze[cr][cc]=='X'){
            return;
        }
        if(cr==maze.length-1 && cc==maze[0].length-1){
            b=true;
            ans[cr][cc]=1;
            display(ans);
            return;
        }
        
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        path(maze,cr-1,cc,ans);
        path(maze,cr,cc-1,ans);
        path(maze,cr+1,cc,ans);
        path(maze,cr,cc+1,ans);
        maze[cr][cc]='O';
        ans[cr][cc]=0;
    }
    public static void display(int[][] ans){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
