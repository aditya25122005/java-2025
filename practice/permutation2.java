package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(permuteUnique(nums));
    }
     public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        Arrays.sort(nums);
        boolean [] b=new boolean[nums.length];
        permutation2(nums,ans,ll,b,0);
        return ans;
    }
    public static void permutation2(int [] nums,List<List<Integer>> ans,List<Integer> ll,boolean[] b,int idx){
        if(idx==nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && !b[i-1]){
                continue;
            }
            if(b[i]==false){
                b[i]=true;
                ll.add(nums[i]);
                permutation2(nums,ans,ll,b,idx+1);
                ll.remove(ll.size()-1);
                b[i]=false;
            }
                 
        }
    }
}
