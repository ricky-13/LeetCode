package Easy;

import java.util.Arrays;

public class ArrayPartition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i+=2){
            int min = Math.min(nums[i], nums[i + 1]);
            sum = sum + min;
        }

        return sum;
    }

//    public int arrayPairSum(int[] nums) {
//        int[] exist = new int[20001];
//        for (int i = 0; i < nums.length; i++) {
//            exist[nums[i] + 10000]++;
//        }
//        int sum = 0;
//        boolean odd = true;
//        for (int i = 0; i < exist.length; i++) {
//            while (exist[i] > 0) {
//                if (odd) {
//                    sum += i - 10000;
//                }
//                odd = !odd;
//                exist[i]--;
//            }
//        }
//        return sum;
//    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 6 ,5,1,2};

        System.out.println(arrayPairSum(arr));
    }
}
