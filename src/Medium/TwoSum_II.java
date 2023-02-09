package Medium;

public class TwoSum_II {
    public static int[] twoSum(int[] numbers, int target) {
        int[] solArray = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {

//            System.out.println(left + " " + right);

            if(numbers[left] + numbers[right] < target){
                left++;
            }
            else if (numbers[left] + numbers[right] > target){
                right--;
//                System.out.println(right);
            }
            else if(numbers[left] + numbers[right] == target){
                solArray[0] = left + 1;
                solArray[1] = right + 1;
                return solArray;
            }
        }
        return solArray;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] sol = twoSum(arr, 9);
//
        for (int i : sol) {
            System.out.println(i);
        }

    }
}
