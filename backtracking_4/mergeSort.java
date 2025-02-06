package backtracking_4;

public class mergeSort {
    public static void main(String[] args) {
        int [] arr1={2,3,5,7,8};
        int [] arr2={1,3,5,8,9,11,13};
       int [] a= Merge_Two_Array(arr1, arr2);
       for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
       }
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

