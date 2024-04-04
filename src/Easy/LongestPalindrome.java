package Easy;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void longestPalindrome(String s) {
        int[] charMap = new int[256];
        int count =0 ;
//        characters automatically parse to their ascii values and hence the arr
//        only needs a constant space
        for(int i = 0; i < s.length(); i++){
//            System.out.println(s.charAt(i));
//            int x = s.charAt(i);
//            System.out.println(x);
//            System.out.println(Integer(s.charAt(i)));
            charMap[s.charAt(i)]++;
        }

        for(int i = 0; i < charMap.length; i++){
            if(charMap[i]%2 == 1 && count%2 == 1){
                count = count + charMap[i] - 1;
            }
            else{
                count = count + charMap[i];
            }
        }

//        if(count)

        System.out.println(count);

//        HashMap<Character, Integer> hm = new HashMap<>();
//        int count =0;
//        for(int i = 0; i < s.length(); i++) {
//            if (hm.containsKey(s.charAt(i))) {
//                int a = hm.get(s.charAt(i));
//                ++a;
//                hm.replace(s.charAt(i), a);
//            } else {
//                hm.put(s.charAt(i), 1);
//            }
//        }
//
////        for(int i = 0; i < )
//        for(Map.Entry me : hm.entrySet()){
//            if((int)me.getValue() >= 2 ){
//                if((int)me.getValue()%2 == 1 && count%2 == 1){
//                    count = count + (int)me.getValue() - 1;
////                    System.out.println(count);
//                }
//                else{
//                    count = count + (int)me.getValue() ;
////                    System.out.println(count);
//                }
//
//            }
////            else if((int)me.getValue() >= 2 && (int)me.getValue()%2 == 1){
////                count = count + (int)me.getValue() - 1;  && (int)me.getValue()%2 == 0
////            }
//        }
//
//        if(hm.containsValue(1) && count%2 == 0){
//            count = count + 1;
//        }
////        return count;
//        System.out.println(count);
//        System.out.println(hm);
    }

    public static void main(String[] args){
        String s = "aad";
//        System.out.println(longestPalindrome(s));
        longestPalindrome(s);
    }

}
