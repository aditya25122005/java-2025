package backtracking;

public class queenCombination {
public static void main(String[] args) {
    int n=4;
    boolean [] board=new boolean [n];
    int tq=2;
    combination(board,tq,"",0,0);
}
    public static void combination(boolean [] board,int tq,String ans, int idx,int qpsf){
        if(tq==qpsf){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++){
            if(!board[i]){
                board[i]=true;
                combination(board,tq,ans+"b"+i+"q"+qpsf,i+1,qpsf+1);
                board[i]=false;
            }
        }
    }
    
}