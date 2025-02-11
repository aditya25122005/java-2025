package cf;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            String str=sc.next();
            int n=str.length();
            StringBuilder sb=new StringBuilder();
            sb.append(str.substring(0,n-2));
            sb.append("i");
            System.out.println(sb);
        }
    }
}
