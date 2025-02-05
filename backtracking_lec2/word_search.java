package backtracking_lec2;

public class word_search {
    public static void main(String[] args) {
        char[][] maze = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                if(maze[i][j]==word.charAt(0)){
                    boolean ans=search(maze, word, i, j,0);
                    if(ans==true){
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
        
    }
    public static boolean search(char[][] maze,String word,int cr, int cc,int idx){
        if(idx==word.length()){
            return true;
        }
        if(cc<0 || cr<0 || cc>maze[0].length-1 || cr>maze.length-1 || maze[cr][cc]!= word.charAt(idx)){
            return false;
        }
        maze[cr][cc]='*';
        int [] r={-1,0,1,0};
        int [] c={0,-1,0,1};

        for(int i=0;i<r.length;i++){
           boolean ans= search(maze,word,cr+r[i],cc+c[i],idx+1);
           if(ans==true){
            return true;
            }
        }
        maze[cr][cc]=word.charAt(idx);
        return false;
    }
}
