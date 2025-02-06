package backtracking_4;

public class Divide_and_conquer {
    public static void main(String[] args) {
         int [] arr={5,7,3,4,2};
       int [] ans=  sort(arr, 0, arr.length-1);
         for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
        }
         
    }
    public static int [] sort(int [] arr,int si,int ei){
        if(si==ei){
            int [] bs=new int[1];
            bs[0]=arr[si];  
            return bs;
        }
        int mid=(si+ei)/2;
        int [] a=sort(arr,si,mid);
        int [] b=sort(arr,mid+1,ei);
        return Merge_Two_Array(a, b);

    }
    public static int [] Merge_Two_Array(int[] arr1,int [] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int [] ans=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        } 
        while(i<n){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m){
            ans[k]=arr2[j];
            k++;
            j++;
        }
        return ans;

    }
}
