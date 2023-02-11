package Medium;

import java.util.Arrays;

public class MinimumSizeSubarraySum {
//    public static int minSubArrayLen(int target, int[] nums) {
//        int[] extra = new int[100000];
//        for (int i = 0; i < nums.length; i++) {
//            extra[nums[i]]++;
//        }
//        int count = 0;
//        int sum = 0;
//        for(int i = extra.length - 1; i > 0; i--){
//            if(extra[i] > 0){
//                for (int j = 1; j <= extra[i]; j++) {
//                    sum = sum + i;
//                    count++;
//                    extra[i]--;
//                    if(sum >= target){
//                        return count;
//                    }
//                }
//            }
//
//        }
//        return 0;
//    }

    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int count = 0;
        int min = 100001;
        for (int i = 0; i < nums.length; i++) {
            for (int k = i; k < nums.length; k++) {
                sum = sum + nums[k];
                count++;
                if(sum >= target && count < min){
                    min = count;
                    break;
                }
            }
            count = 0;
            sum = 0;
        }
        if(min == 100001){
            return 0;
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
