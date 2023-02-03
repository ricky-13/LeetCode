package Easy;

import java.util.HashMap;

public class LongestPalindrome {
    public static void longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap();

        for(int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                int a = hm.get(s.charAt(i));
                a++;
                hm.replace(s.charAt(i), a);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }

//        for(int i = 0; i < )
        for(String str : s){

        }
        System.out.println(hm);

    }

    public static void main(String[] args) {
        String s = "abccccdd";
        longestPalindrome(s);
    }
}
