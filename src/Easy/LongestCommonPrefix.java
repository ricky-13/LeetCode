package Easy;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int minLength = 1999999999;
        StringBuilder str = new StringBuilder();
        if(strs.length == 1){
            return strs[0];
        }
        for(int i = 0; i < strs.length; i++){
            if(minLength > strs[i].length()){
                minLength = strs[i].length();
            }
        }
        for(int i = 0; i < minLength; i++){
            for(int j = 0; j < strs.length - 1; j++){
                if(strs[j].charAt(i) != strs[j + 1].charAt(i)){
                    return String.valueOf(str);
                }
            }
            str.append(strs[0].charAt(i));
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"flower", "flo"};
        String s = longestCommonPrefix(arr);
        System.out.println(s);
    }
}
