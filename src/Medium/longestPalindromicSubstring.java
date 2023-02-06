package Medium;

public class longestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        StringBuilder s1 = new StringBuilder(s);
        String sReverse = String.valueOf(s1.reverse());
        System.out.println(sReverse);
        int[][] dp = new int[s.length()+1][s.length()+1];
        int maxLength = 0;
        int indexJ= 0;
//        for(int i = 0; i < dp.length; i++){
//            dp[i][0] = 0;
//        }
////        System.out.println(dp[0].toString());
//        for(int j = 0; j < dp[0].length; j++){
//            dp[0][j] = 0;
//        }

        for(int i = 1; i < dp.length; i++){
            for (int j = 1; j < dp[1].length; j++) {
                if(s.charAt(i-1) == sReverse.charAt(j-1) && s.charAt(i) == sReverse.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if(maxLength < dp[i][j]){
                        maxLength = dp[i][j];
                        indexJ = j;
                    }
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }

//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                System.out.print(dp[i][j] + " ");
//            }
//            System.out.println();
//        }

        String ans = sReverse.substring(indexJ - maxLength, indexJ);
//        System.out.println(indexJ);
        return ans + String.valueOf(maxLength);
    }

    public static void main(String[] args) {
        String s = longestPalindrome("aacabdkacaa");
//                                       aacakdbacaa
//        longestPalindrome("babad");
        System.out.println(s);
    }
}
