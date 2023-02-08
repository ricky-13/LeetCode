package PPS;

public class MysteryElement {
//    public static void missingElement(int[] arr){
//        int max = 0;
//
//        for(int i = 0; i< arr.length; i++){
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//
//        boolean[] parallel = new boolean[max+1];
//// max + 1
//        for (int i = 0; i < arr.length; i++)  {
//            parallel[arr[i]] = true;
//        }
//
//        for(int i = 1; i < parallel.length; i++){
//            if(parallel[i] == false){
//                System.out.println(i);
//            }
//        }
//    }

    public static int missingNumber(int[] nums) {

        int max = 0;

        for(int i = 0; i< nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        if(max < nums.length){
            max = nums.length;
        }

        boolean[] parallel = new boolean[max+1];

        for (int i = 0; i < nums.length; i++)  {
            parallel[nums[i]] = true;
        }
//
        for(int i = 0; i < parallel.length; i++){
            if(parallel[i] == false){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1};
        System.out.println(missingNumber(arr));
    }
}

//
//n(n+1)/2