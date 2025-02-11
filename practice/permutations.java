package practice;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        System.out.println(permute(nums));
    }
     public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        boolean [] b=new boolean[nums.length];
        permutation(nums,ans,ll,b);
        return ans;
    }
    public static void permutation(int [] nums, List<List<Integer>> ans,  List<Integer> ll , boolean [] b){
        if(ll.size()==nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(b[i]==false){
                b[i]=true;
                ll.add(nums[i]);
                permutation(nums,ans,ll,b);
                b[i]=false;
                ll.remove(ll.size()-1);
            }

        }
    }
}
