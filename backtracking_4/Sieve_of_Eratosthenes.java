package backtracking_4;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n=100;
        System.out.println(PrimeSieve(n));
    }
    //Jis index pe 0 hai is index ko prime number bolenge
    public static int PrimeSieve(int n){
        int [] ans=new int[n];
        ans[0]=ans[1]=1;
        for(int i=2;i*i<=ans.length;i++){
            if(ans[i]==0){ // i is prime number 
                for(int j=2;i*j <ans.length;j++){
                    ans[i*j]=1;
            }
            }
         }
         int c=0;
         for(int i=2;i<ans.length;i++){
            if(ans[i]==0){
                c++;
            }
         }
         return c;
    }   
}