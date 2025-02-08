package practice;
public class leetcode_357_Unique_digit{
    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(2));
    }
    public static int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        boolean [] b=new boolean[10];
        int ans=1+count(n,0,b);
        return ans;

    }
    public static int count(int n, int length,boolean[] b){
        if(length==n){
            return 0;
        }
        int c=0;
        for(int i=(length==0)? 1:0;i<=9;i++){
            if(b[i]==false){
                b[i]=true;
               c+= 1+ count(n,length+1,b);
                b[i]=false;
            }
        }
        return c;
    }
}