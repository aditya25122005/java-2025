package recursion_lecture_4;

public class permutation2 {
    public static void main(String[] args) {
        String s="AABC";
        print(s,"");
    }
    public static void print(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!check(i+1, s, ch)){
            String s1=s.substring(0, i);
            String s2=s.substring(i+1);
            print(s1+s2,ans+ch);
            }
        }
    }
    public static boolean check(int i,String str,char ch){
        for(int idx=i;idx<str.length();idx++){
            if(str.charAt(idx)==ch){
                return true;
            }
        }
        return false;
    }
}