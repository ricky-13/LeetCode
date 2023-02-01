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

    }
}
