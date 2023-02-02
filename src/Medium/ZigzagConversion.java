package Medium;

public class ZigzagConversion {
    public static String convert(String s, int numRows){

        if(numRows == 1){
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            sb[i] = new StringBuilder();
        }
        int count = 0;
        int oneLess = numRows - 1;
        String ans = "";
        boolean flag = true;
        for(int i = 0; i < s.length(); i++){
            if(i%oneLess == 0){
                flag = !flag;
            }

            if (flag == false){
                sb[count++].append(s.charAt(i));
            }
            if(flag == true){
                sb[count--].append(s.charAt(i));
            }

//            if(count == 0){
//                sb[count++].append(s.charAt(i));
//            }
//            if(count == 4){
//                sb[count--].append(s.charAt(i));
//            }
        }

        for(int i = 0; i < numRows; i++){
            ans = ans + sb[i];
        }

        return ans;
    }

//    public String convert(String s, int numRows) {
//        if(numRows == 1) return s;
//        int n = s.length(), incr = 2*(numRows-1), ind = 0, zig = incr;
//        char ch[] = new char[n];
//
//        for(int i = 0; i<numRows; i++) {
//            for(int j = i; j<s.length(); j += incr) {
//                ch[ind++] = s.charAt(j);
//                if(i != 0 && i != numRows-1 && j + zig < s.length())
//                    ch[ind++] = s.charAt(j + zig);
//            }
//            zig-=2;
//        }
//
//        return new String(ch);
//    }

    public static void main(String[] args) {
        String s = "A";
        String and = convert(s, 1);
        System.out.println(and);
    }
}
