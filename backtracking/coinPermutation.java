package backtracking;
public class coinPermutation {
    public static void main(String[] args) {
        int [] coins = {2,3,5};
        int amount = 8;
        String ans="";
        permutation(coins, amount, ans);

    }
    public static void permutation(int [] coin,int amount,String ans){
        if(amount==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<coin.length;i++){
            if(amount>=coin[i]){
                permutation(coin,amount-coin[i],ans+coin[i]);

            }
        }
    }
}
