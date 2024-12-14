package twosixtwo.section5_array;

import java.util.Arrays;

public class NetherlandsFlagProblem_5_1 {

    public static enum Color{
        RED,
        WHITE,
        BLUE
    }

    public static void threeWayPartition(int[] A) {
        int start = 0, mid = 0;
        int pivot = 1;
        int end = A.length - 1;

        while(mid <= end){
            if (A[mid] < pivot){
                swap(A, start, mid);
                start++;
                mid++;
            }else if(A[mid] > pivot){
                swap(A, mid, end);
                --end;
            }else{
                ++mid;
            }
        }
    }

    private static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main (String[] args) {
        int[] A = { 1,1,1,0,0,0,0,0,0,0,0,2};

        threeWayPartition(A);
        System.out.println(Arrays.toString(A));
    }

}
