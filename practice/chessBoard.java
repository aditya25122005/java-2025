package practice;

import java.util.Scanner;

public class chessBoard {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n,0,0,n-1,n-1,"");
        System.out.println("\n"+c);

    }
    static int c=0;
    public static void print(int n, int cr, int cc, int er, int ec,String ans){
        if(cr==er && cc==ec){
            System.out.print(ans+"{"+cr+"-"+cc+"}"+" ");
            c++;
            return;
        }
        if(cr>=n || cc>=n){
            return;
        }
        //knight
        print(n,cr+2,cc+1,er,ec,ans+"{"+cr+"-"+cc+"}K");
        print(n,cr+1,cc+2,er,ec,ans+"{"+cr+"-"+cc+"}K");

        //Rook
        if(cr==0 || cr==er || cc==0 || cc==ec){
            for(int i=1;i<=n;i++){
                print(n,cr,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}R");
                
            }
            for(int i=1;i<=n;i++){
                print(n,cr+i,cc,er,ec,ans+"{"+cr+"-"+cc+"}R");
            }
        }
        //Bishop
        if(cr==cc || cr+cc==n-1){
            for(int i=1;i<=n;i++){
                print(n,cr+i,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}B");
            }
        }
    }
}
