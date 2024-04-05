package Easy;

public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        if(s.length() == 1){
            return true;
        }
        char l = s.charAt(0);
        char r = s.charAt(s.length() - 1);


        for(int i = 0; i < s.length()/2; i++){
            if(l != r) {
                return false;
            } else {
                l = s.charAt(i+1);
                r = s.charAt(s.length() - 1 - i - 1);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int x = 01;
        System.out.println(isPalindrome(x));
    }
}
