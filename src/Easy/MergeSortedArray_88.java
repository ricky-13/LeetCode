package Easy;

public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int a = 0;
        int b = 0;
        for(int i = 0; i < m+n; i++){


            if( a == m && b != n ){
                arr[i] = nums2[b];
                b++;
                continue;
            }
            if( b == n && a != m ){
                arr[i] = nums1[a];
                a++;
                continue;
            }

            if(nums1[a] < nums2[b] ){
                arr[i] = nums1[a];
                a++;
            } else {
                arr[i] = nums2[b];
                b++;
            }
        }

        for (int i = 0; i < m+n; i++) {
            nums1[i] = arr[i];
        }

//        public void merge(int[] nums1, int m, int[] nums2, int n) {
//            int i = m - 1;
//            int j = n - 1;
//            int k = m + n - 1;
//
//            while (j >= 0) {
//                if (i >= 0 && nums1[i] > nums2[j]) {
//                    nums1[k--] = nums1[i--];
//                } else {
//                    nums1[k--] = nums2[j--];
//                }
//            }
//        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        MergeSortedArray_88 obj = new MergeSortedArray_88();
        obj.merge(nums1, 3, nums2, 3);


        for (int i = 0; i < 6; i++) {
            System.out.println(nums1[i]);
        }
    }
}
