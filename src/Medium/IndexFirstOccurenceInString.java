package Medium;

public class IndexFirstOccurenceInString {
    public static int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        for(int i = 0; i < haystack.length(); i++){
            if(needle.length() > haystack.length() - i){
                break;
            }
            for(int j = 0; j < needle.length(); j++){
                if(haystack.charAt(i+j) != needle.charAt(j) ){
                    break;
                }

                if(haystack.charAt(i + needle.length() -1 ) == needle.charAt(needle.length() - 1) && j == needle.length() - 1){
                    return (i);
                }
            }
        }
        return -1;
    }

//    public int strStr(String haystack, String needle) {
//        for(int i=0;i<haystack.length()-needle.length()+1;i++){
//            if(haystack.charAt(i)==needle.charAt(0)){
//                if(haystack.substring(i,needle.length()+i).equals(needle)){
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        String s1 = "banana";
        String s2 = "ana";

//        String s1 = "sdhsadkkj";
//        String s2 = "sad";

        int ans = strStr(s1, s2);
        System.out.println(ans );
    }
}
