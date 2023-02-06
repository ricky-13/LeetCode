package Easy;

public class ReverseString {
    public static void reverseString(char[] s) {
        for(int i = 0; i < s.length/2; i++){
            char tmp = s[s.length - 1 - i];
//            System.out.println(tmp);
            s[s.length - 1 - i] = s[i];
            s[i] = tmp;
        }

        for(char a : s){
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }
}
