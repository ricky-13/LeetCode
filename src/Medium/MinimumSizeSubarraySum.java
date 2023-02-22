package Medium;

import java.util.Arrays;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {

        int min = 0;
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            while(currentSum > target){

            }
        }
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
