package practice;

import java.util.ArrayList;
import java.util.List;

public class combination_sum3 {
    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 7));
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        solve(n,k,ans,ll,1);
        return ans;
    }
    public static void solve(int n, int k, List<List<Integer>> ans, List<Integer> ll,int idx){
        if(n==0 && ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=idx;i<=9;i++){
            
            if(n>=i){
                ll.add(i);
                solve(n-i,k,ans,ll,i+1);
                ll.remove(ll.size()-1);
            }
        }
    }
}
