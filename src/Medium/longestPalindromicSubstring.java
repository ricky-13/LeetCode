package Medium;

public class longestPalindromicSubstring {
//    public static String longestPalindrome(String s) {
//        StringBuilder s1 = new StringBuilder(s);
//        String sReverse = String.valueOf(s1.reverse());
//        System.out.println(sReverse);
//        int[][] dp = new int[s.length()+1][s.length()+1];
//        int maxLength = 0;
//        int indexJ= 0;
////        for(int i = 0; i < dp.length; i++){
////            dp[i][0] = 0;
////        }
//////        System.out.println(dp[0].toString());
////        for(int j = 0; j < dp[0].length; j++){
////            dp[0][j] = 0;
////        }
//
//        for(int i = 1; i < dp.length; i++){
//            for (int j = 1; j < dp[1].length; j++) {
//                if(s.charAt(i-1) == sReverse.charAt(j-1) && s.charAt(i) == sReverse.charAt(j-1)){
//                    dp[i][j] = dp[i-1][j-1] + 1;
//                    if(maxLength < dp[i][j]){
//                        maxLength = dp[i][j];
//                        indexJ = j;
//                    }
//                }
//                else{
//                    dp[i][j] = 0;
//                }
//            }
//        }
//
////        for (int i = 0; i < dp.length; i++) {
////            for (int j = 0; j < dp[0].length; j++) {
////                System.out.print(dp[i][j] + " ");
////            }
////            System.out.println();
////        }
//
//        String ans = sReverse.substring(indexJ - maxLength, indexJ);
////        System.out.println(indexJ);
//        return ans + String.valueOf(maxLength);
//    }



    public static String longestPalindrome(String s){
        int[][] dp = new int[s.length()][s.length()];
        int ansI = 0, ansJ = 0;
        int maxLength = 1;

        for(int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
        }

        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)){
                dp[i][i+1] = 1;
                if( i + 1 - i + 1 > maxLength){
                    maxLength = i + 1 - i + 1;
                    ansI = i;
                    ansJ = i + 1;
                }
            }
        }


        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(j >= i + 1){
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == 1){
                        dp[i][j] = 1;
                        if( j - i + 1 > maxLength){
                            maxLength = j - i + 1;
                            ansI = i;
                            ansJ = j;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return s.substring(ansI,ansJ + 1);
    }

    public static void main(String[] args) {
        String s = longestPalindrome("aaaaa");
//                                       aacakdbacaa
//        longestPalindrome("babad");
        System.out.println(s);
    }
}
