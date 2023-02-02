package Medium;

public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j < dp[0].length; j++){
            dp[0][j] = 0;
        }

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[text1.length()][text2.length()];
    }

    public static void main(String[] args) {
        String s = "";
        String s1 = "";
        System.out.println(longestCommonSubsequence(s,s1));
    }
}
