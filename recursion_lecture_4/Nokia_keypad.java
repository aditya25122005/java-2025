package recursion_lecture_4;

public class Nokia_keypad {
    public static void main(String[] args) {
        String ques="23";
        combination(ques,"");
    }
    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno","pqrs" ,"tuv","wxyz"};

    public static void combination(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch=ques.charAt(0);
        String s=keypad[ch-'0'];
        for(int i=0;i<s.length();i++){
            combination(ques.substring(1), ans+s.charAt(i));
        }
    }

}
