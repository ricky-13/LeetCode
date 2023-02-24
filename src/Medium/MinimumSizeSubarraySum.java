package Medium;

import java.util.Arrays;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {

        int min = Integer.MAX_VALUE;
        int currentSum = 0;
        int j = 0;
        int currentLength = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
            currentLength++;
            while(currentSum > target){
                j++;
                currentSum = currentSum - nums[j];
                currentLength -= 1;
                if(currentSum >= target){
                    min = currentLength < min ? currentLength : min;
                }
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr = {2,3, 1, 2, 4, 3};
//        for (int i :
//                arr) {
//            System.out.println(i);
//        }
        System.out.println(minSubArrayLen(7, arr));

    }
}
