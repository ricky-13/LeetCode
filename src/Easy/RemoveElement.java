package Easy;

public class RemoveElement {
    public static int removeElement(int[] A, int elem) {
        int k = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] != elem){
                A[k] = A[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,0,2,2,1,4,4,1,4,3,2};
        System.out.println(removeElement(arr, 4));
//        removeElement(arr, 2);

    }
}
