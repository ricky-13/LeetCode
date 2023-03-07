package Medium;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        boolean[] parallelArr = new boolean[nums.length];

        parallelArr[0] = true;

        for(int i = 0; i < nums.length; i++){
            if(parallelArr[i] == true){
                for(int j = 1; j <= nums[i] && i+j < nums.length; j++){
                    parallelArr[i + j] = true;
                }
            }

        }
        return parallelArr[nums.length -1];
    }

    public static void main(String[] args) {

        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));

    }
}
