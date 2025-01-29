package backtracking;
public class coin_Combination {

    public static void main(String[] args) {

        int [] coins = {2,3,5};
        int amount = 8;
        String ans="";
        combination(coins, amount, ans,0);
    }
    public static void combination(int [] coin,int amount,String ans,int idx){
        if(amount==0){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<coin.length;i++){
            if(amount>=coin[i]){
                combination(coin,amount-coin[i],ans+coin[i],i);

            }
        }
    }
}