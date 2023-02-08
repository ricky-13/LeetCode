package Easy;

public class ReverseString {
    public static void reverseString(char[] s) {
        for(int i = 0; i < s.length/2; i++){
            char tmp = s[s.length - 1 - i];
//            System.out.println(tmp);
            s[s.length - 1 - i] = s[i];
            s[i] = tmp;
        }
//        System.out.prin]");
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

//        ("[");
//        for(int i = 0; i < s.length; i++){
//            if(i == s.length - 1){
//                System.out.print("\"" + s[i] + "\"");
//            }
//            else{
//                System.out.print("\"" + s[i] + "\"" + ",");
//            }
//
//        }
//        System.out.print("
    }
}
