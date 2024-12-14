package twosixtwo.section5_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NetherlandsFlagProblem_5_1_2 {

    public static enum Color{
        RED,
        WHITE,
        BLUE
    }

    public static void dutchFlagPartition(int pivotIndex, List<Color> A){
        Color pivot = A.get(pivotIndex);
        for(int i=0;i <A.size(); i++) {
            for(int j=i+1; j<A.size(); j++){
                if(A.get(j).ordinal()<pivot.ordinal()){
                    Collections.swap(A, i, j);
                    break;
                }
            }
        }

        for(int i=A.size()-1; i>=0 && A.get(i).ordinal() >= pivot.ordinal(); i--){
            for(int j=i-1; j>=0 && A.get(j).ordinal() >= pivot.ordinal(); j--){
                if(A.get(j).ordinal() > pivot.ordinal()){
                    Collections.swap(A, i, j);
                    break;
                }
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

//        threeWayPartition(A);
        System.out.println(Arrays.toString(A));
    }

}
