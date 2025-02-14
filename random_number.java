import java.util.Random;
public class random_number {
    public static void main(String[] args) {
        int si=10;
        int ei=100;
        //10 Random Number
        Random rn=new Random();
        for(int i=0;i<10;i++){
            int x=rn.nextInt(ei-si+1) + si;
            System.out.println(x);
        }
        
    }
}
    