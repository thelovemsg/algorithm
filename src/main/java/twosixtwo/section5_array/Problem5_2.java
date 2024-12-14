package twosixtwo.section5_array;

import java.util.ArrayList;
import java.util.List;

/**
 * 임의의 정수갑 증가시키기
 *
 * 십진수 D를 나타낸 배열 A가 주어졌을 때, D + 1의 결과를 다시
 * 배열 A에 갱신하는 코드를 작성하시오(내가왜? 히힛)
 */
public class Problem5_2 {

    /**
     * 내가 생각한 풀이.
     *
     * 뒤에서부터 시작해서, 더한것을 넘겨주는 식으로 해서 List에 넣은 다음
     * reverse 해버린다.
     *
     *
     */

    public static List<Integer> plusOne(List<Integer> A) {
        int n = A.size() - 1;
        A.set(n, A.get(n) + 1);
        for (int i=n; i>0 && A.get(i) == 10; --i){
            A.set(i, 0);
            A.set(i-1, A.get(i-1) + 1);
        }

        if (A.get(0) == 10) {
            A.set(0, 1);
            A.add(0);
        }
        return A;
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(){};
        A.add(1);
        A.add(3);
        A.add(1);
        plusOne(A);
        System.out.println(A.toString());
    }
}
