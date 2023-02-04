package Easy;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int count =0;
        for(int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                int a = hm.get(s.charAt(i));
                ++a;
                hm.replace(s.charAt(i), a);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }

//        for(int i = 0; i < )
        for(Map.Entry me : hm.entrySet()){
            if((int)me.getValue() >= 2 ){
                if(count%2 == 1){
                    count = count + (int)me.getValue() - 1;
                }
                else{
                    count = count + (int)me.getValue() ;
                }

            }
//            else if((int)me.getValue() >= 2 && (int)me.getValue()%2 == 1){
//                count = count + (int)me.getValue() - 1;  && (int)me.getValue()%2 == 0
//            }
        }

        if(hm.containsValue(1) && count%2 == 0){
            count = count + 1;
        }
//        return count;
        System.out.println(count);
        System.out.println(hm);
    }

    public static void main(String[] args){
        String s = "aaabb";
//        System.out.println(longestPalindrome(s));
        longestPalindrome(s);
    }

}
