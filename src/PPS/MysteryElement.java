package PPS;

public class MysteryElement {
    public static void missingElement(int[] arr){
        int max = 0;

        for(int i = 0; i< arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        boolean[] parallel = new boolean[max+1];
// max + 1
        for (int i = 0; i < arr.length; i++) {
            parallel[arr[i]] = true;
        }

        for(int i = 1; i < parallel.length; i++){
            if(parallel[i] == false){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 3, 4, 5, 6, 8, 9, 10, 11};
        missingElement(arr);
    }
}
