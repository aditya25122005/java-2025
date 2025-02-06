package backtracking_4;

public class count_prime {
    public static void main(String[] args) {
        
    }
    public static boolean isPrime(int n){
        int div=2;
        while(div*div<=n){
            if(n%div ==0){
                return false;
            }
            div++;
        }
        return true;
    }
}
