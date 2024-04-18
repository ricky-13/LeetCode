package Easy;

public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        for(int i = 0; i < m + n; i++){
            int a = 0;
            int b = 0;

            if(nums1[a] < nums2[b]){
                arr[i] = nums1[a];
                a++;
            } else {
                arr[i] = nums2[b];
                b++;
            }
        }

        for(int i = 0; i < m + n; i++){
            nums1[i] = arr[i];
        }
    }
}
