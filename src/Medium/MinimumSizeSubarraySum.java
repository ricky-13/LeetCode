package Medium;

import java.util.Arrays;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {

        int min = Integer.MAX_VALUE;
        int currentSum = 0;
        int j = 0;
        int currentLength = 0;
        int i;

        if (nums == null || nums.length == 0){
            return 0;
        }

        for ( i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
            currentLength++;
            while(currentSum >= target){
                min = currentLength < min ? currentLength : min;

                j++;
                currentSum = currentSum - nums[j];
                currentLength -= 1;

            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

//    public int minSubArrayLen(int target, int[] nums) {
//        if (nums == null || nums.length == 0)
//            return 0;
//
//        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
//
//        while (j < nums.length) {
//            sum += nums[j++];
//
//            while (sum >= target) {
//                min = Math.min(min, j - i);
//                sum -= nums[i++];
//            }
//        }
//
//        return min == Integer.MAX_VALUE ? 0 : min;
//    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        for (int i :
//                arr) {
//            System.out.println(i);
//        }
        System.out.println(minSubArrayLen(15, arr));
    }
}
