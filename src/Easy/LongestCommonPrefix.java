package Easy;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int max = 0;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < strs.length; i++){
            if(max < strs[i].length()){
                max = strs[i].length();
            }
        }
        for(int i = 0; i < max; i++){
            for(int j = 0; j < strs.length - 1; j++){
                if(strs[j].charAt(i) != strs[j + 1].charAt(i)){
                    return String.valueOf(str);
                }
            }
            str.append(strs[0].charAt(i));
        }
    return "";
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"flower","flow","ght"};
        String s = longestCommonPrefix(arr);
        System.out.println(s);
    }
}
