package cf;
import java.util.*;
public class B {
    
                  public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();  // Number of test cases
                sc.nextLine();  // Consume newline
        
                while (t-- > 0) {
                    String s = sc.nextLine();
                    System.out.println(getMinimumLength(s));
                }
                sc.close();
    }
    public static int getMinimumLength(String s) {
        int count = 1;  // At least one distinct group
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                count++;  // New group found
            }
        }
        return count;
    }

   
}
