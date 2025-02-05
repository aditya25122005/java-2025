package backtracking_lec2;

public class Tower_of_hanoi {
    public static void main(String[] args) {
        int n=3;
        TOH(n,"A","C","B");
    }
    public static void TOH(int n,String src,String help, String dest){
        if(n==0){
            return;
        }
        TOH(n-1,src,dest,help);
        System.out.println("Move " + n +" th disk from " +src+ " to "+ dest);
        TOH(n-1,help,src,dest);
    }
    
}
