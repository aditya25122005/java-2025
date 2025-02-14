package practice;

import java.util.ArrayList;
import java.util.List;

public class N_queen_leetcode {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
     public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        List<String> ll =new ArrayList<>();
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        print(n,n,arr,ans,ll,0);
        return ans;


    }
    public static void print(int n,int tq, char[][] arr,List<List<String>> ans,List<String> ll, int row){
        if(tq==0){
            ans.add(construct(arr));
            return;
        }
        for(int col=0;col<n;col++){
            if(issafe(arr,row,col)){
                arr[row][col]='Q';
                print(n,tq-1,arr,ans,ll,row+1);
                arr[row][col]='.';

            }

        }
    }
    public static List<String> construct(char[][] arr){
        List<String> l1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String row=new String(arr[i]);
            l1.add(row);
        }
        return l1;
    }
    public static boolean issafe(char[][] arr, int row, int col){
        //check upward;
        int r=row;
        while(r>=0){
            if(arr[r][col]=='Q'){
                return false;
            }
            r--;
        }
        //check Right Diagonal
        r=row;
        int c=col;
        while(r>=0 && c<arr.length){
            if(arr[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
        //check left
        r=row;
        c=col;
        while(r>=0 && c>=0){
            if(arr[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        return true;
    }
}
