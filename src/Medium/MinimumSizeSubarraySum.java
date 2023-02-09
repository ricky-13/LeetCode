package Medium;

import java.util.Arrays;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int[] extra = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            extra[nums[i]]++;
        }
        int count = 0;
        int sum = 0;
        for(int i = extra.length - 1; i > 0; i--){
            if(extra[i] > 0){
                for (int j = 1; j <= extra[i]; j++) {
                    sum = sum + i;
                    count++;
                    extra[i]--;
                    if(sum >= target){
                        return count;
                    }
                }
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {12,28,83,4,25,26,25,2,25,25,25,12};
        int[] arr1 = {2,4,12,12,25,25,25,25,25,26,28,83};

        Arrays.sort(arr);
        for (int i :
                arr) {
            System.out.println(i);
        }
        System.out.println(minSubArrayLen(213, arr));

    }
}
