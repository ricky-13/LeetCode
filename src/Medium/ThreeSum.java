package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List l1 = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            List l = new ArrayList();
            HashMap hm = new HashMap<Integer,Integer>();
            int target = - nums[i];
            for(int j = 0; j < nums.length; j++) {
                if(j != i ){
                    if( hm.containsKey(target - nums[j])){
                        l.add(nums[i]);
                        l.add(nums[j]);
                        int x = (int) hm.get(target - nums[j]);
                        l.add(nums[x]);
                        l1.add(l);
                        break;
                    } else {
                        hm.put(nums[j], j);
                    }
                }
            }
        }
        return l1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(arr));
    }
}
