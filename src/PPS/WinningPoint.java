package PPS;

public class WinningPoint {
    public static void main(String[] args) {
        int[] arr = {2,4,6,1,4,3,2,3,5,7};
        int maxLength = 0;
        int max = 0;
        int currentCount = 1;
        int startIndex =0;
        int endIndex=0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i+1]){
                currentCount++;
            }
            else{

                currentCount = 1;
            }
            if(maxLength < currentCount){
                maxLength = currentCount;
            }
        }

        System.out.println(maxLength);
        currentCount = 1;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i+1]){
                currentCount++;
            }
            else{

                currentCount = 1;
            }
            if(max < currentCount){
                max = currentCount;
                if(max == maxLength){
                    startIndex = i - (maxLength - 2);
                    break;
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(startIndex);

        int x = Integer.MAX_VALUE;
        System.out.println(x);

        String b = new String("String");

        String a = "String";

        System.out.println(a == b);

//        Object[] o = {}

        int[] a1 = {1,2,3};
        int[] b1 = {4,6,78,8,9};

        a1 = b1;
        System.out.println(a1);
        System.out.println(b1);



    }
}
