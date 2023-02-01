package PPS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RaggedCompressor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num rows = ");
        int numRows = sc.nextInt();

        int[][] raggedArr = new int[numRows][];
        for(int i = 0; i < numRows; i++){
            System.out.println("Enter num of elements in row " + (i+1) + " - ");
            int numElements = sc.nextInt();
            raggedArr[i] = new int[numElements];
            System.out.println("Enter elements of row " + (i+1) + " - ");

            for(int j = 0; j < numElements; j++){
                raggedArr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < raggedArr.length; i++){
            boolean[] temp = new boolean[raggedArr[i].length];
            int count = raggedArr[i].length;
            for (int j = 0; j < raggedArr[i].length; j++) {
                for (int k = j+1; k < raggedArr[i].length; k++) {
                    if(raggedArr[i][j] == raggedArr[i][k] && temp[k] != true){
                        temp[k]=true;
                        count--;
                    }
                }
            }


            int[] t = new int[count];
            int indexForT = 0;
            for(int x = 0; x < raggedArr[i].length; x++){
                if(temp[x] == false){
                    t[indexForT] = raggedArr[i][x];
                    indexForT++;
                }
            }
//            raggedArr[i] = new int[t.length];
            raggedArr[i] = t;
//            System.out.println(Arrays.toString(raggedArr));
        }


        for(int i = 0; i < raggedArr.length; i++){
            for(int j = 0; j < raggedArr[i].length; j++){
                System.out.print(raggedArr[i][j] + " ");
            }
            System.out.println();
//            System.out.println(raggedArr[i].length);
            System.out.println();
        }

//        int[] arr = {10, 1, 2};
//        System.out.println(arr);

    }
}
