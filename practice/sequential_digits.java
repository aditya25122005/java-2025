package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class sequential_digits {
    public static void main(String[] args) {
        System.out.println(sequentialDigits(100,300));
    }
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=9;i++){
            generate(low,high,ans,i);
        }
        Collections.sort(ans);
        return ans;
    }
    public static void generate(int low, int high, List<Integer> ans,int num){
        if(num>high){
            return;
        }
        if(num>=low){
            ans.add(num);
            // return;
        }
        int digit= num%10;
        
        if(digit<9){
            generate(low,high,ans,num*10 + (digit+1));
        }
    }
}
