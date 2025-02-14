package practice;

public class count_no_with_uniq_digit {
    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(2));
    }
    public static int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        boolean [] b =new boolean[10];

      return 1+  solution(n,0,b);
    }
    public static int solution(int n, int len, boolean [] b){
        if(len==n){
            return 0;
        }
        int c=0;
        for(int i=(len==0)? 1:0 ;i<=9;i++){
            if(b[i]==false){
                b[i]=true;
               c+= 1 + solution(n,len+1,b);
               b[i]=false;
            }
        }
        return c;
    }
    
}
