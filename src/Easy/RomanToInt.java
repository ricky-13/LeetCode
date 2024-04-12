package Easy;

public class RomanToInt {
    public static int romanToInt(String s) {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        int sum = 0;

        for(int a = 0; a < s.length(); a++){
            if(s.charAt(a) == 'I' && (a != (s.length()-1)) && (s.charAt(a+1) == 'V' || s.charAt(a+1) == 'X') ) {
                if (s.charAt(a + 1) == 'V') {
                    sum = sum + 4;
                    a++;
                } else if (s.charAt(a + 1) == 'X') {
                    sum = sum + 9;
                    a++;
                }
            } else if(s.charAt(a) == 'X' && (a != (s.length()-1)) && (s.charAt(a+1) == 'L' || s.charAt(a+1) == 'C')){
                if(s.charAt(a+1) == 'L'){
                    sum = sum + 40;
                    a++;
                } else if(s.charAt(a+1) == 'C'){
                    sum = sum + 90;
                    a++;
                }
            } else if(s.charAt(a) == 'C' && (a != (s.length()-1)) && (s.charAt(a+1) == 'D' || s.charAt(a+1) == 'M')){
                if(s.charAt(a+1) == 'D'){
                    sum = sum + 400;
                    a++;
                } else if(s.charAt(a+1) == 'M'){
                    sum = sum + 900;
                    a++;
                }
            } else if(s.charAt(a) == 'I'){
                sum = sum + I;
//                System.out.println(sum);
//                System.out.println(a);

            } else if(s.charAt(a) == 'V'){
                sum = sum + V;
//                System.out.println(sum);
//                System.out.println(a);

            } else if(s.charAt(a) == 'X'){
                sum = sum + X;
            } else if(s.charAt(a) == 'L'){
                sum = sum + L;
//                System.out.println(sum);
//                System.out.println(a);

            } else if(s.charAt(a) == 'C'){
                sum = sum + C;
            } else if(s.charAt(a) == 'D'){
                sum = sum + D;
            } else if(s.charAt(a) == 'M'){
                sum = sum + M;
//                System.out.println(sum);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String s = "MCM";
//        System.out.println(s.length());
        System.out.println(romanToInt(s));
    }
}
