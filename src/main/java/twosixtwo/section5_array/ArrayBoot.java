package twosixtwo.section5_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayBoot {
    public static void main(String[] args) {
        /***
         * 정수배열이 주어졌을 때 짝수가 먼저 나오도록 재배열하시오
         */
        int[] target = {1,5,798,4,1,10};
        int head=0;
        int tail = target.length-1;

        while(head<tail) {
            if ((target[head] & 1) == 0) {
                head++;
            } else {
                int temp = target[head];
                target[head] = target[tail];
                target[tail] = temp;
                tail--;
            }
        }

        System.out.println("=======================");
        //Arrays.asList() : 값을 넣으면 List로 변경해준다.
        List<Integer> integers = Arrays.asList(1, 2, 3, 3, 5);
        System.out.println("integers = " + integers);

        //Arrays.binarySearch(A, 641)'
        int a[] = {1,3,5,8,9};
        int i = Arrays.binarySearch(a, 3);
        System.out.println("i = " + i);

        //Arrays.copyOf

    }
}
