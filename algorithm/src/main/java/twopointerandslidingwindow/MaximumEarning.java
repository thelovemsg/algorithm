package twopointerandslidingwindow;

import java.util.Scanner;

public class MaximumEarning {

    /**
     * 설명
     * 현수의 아빠는 제과점을 운영합니다.
     * 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
     * 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
     * 12 1511 20 2510 20 19 13 15
     * 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
     * 여러분이 현수를 도와주세요.
     *
     * 입력
     * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
     * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
     *
     * 출력
     * 첫 줄에 최대 매출액을 출력합니다.
     *
     * 예시
     * * 10 3                          =>      56
     * 12 15 11 20 25 10 20 19 13 15
     */

    public static void main(String[] args) {

        MaximumEarning me = new MaximumEarning();
        Scanner kb = new Scanner(System.in);
        int[] condition = new int[2];
        for(int i=0; i<2; i++){
            condition[i] = kb.nextInt();
        }

        int[] a = new int[condition[0]];
        for(int i=0; i<condition[0]; i++){
            a[i] = kb.nextInt();
        }

        me.solution(condition[0], condition[1], a);
    }

    //강의 풀이
    public void solution1(int n, int k, int[] arr) {
        int answer = 0, sum = 0;
        for (int i = 0; i < k; i++) sum+=arr[i];
        answer = sum;
        for(int i=k; i<n; i++){
            sum+=(arr[i]-arr[i-k]);
            answer=Math.max(answer, sum);
        }
    }

    //내 풀이
    //포인터 부분을 기억하는 것보다 굳이
    private void solution(int times, int sequence, int[] a) {
        int count=0;
        int result = Integer.MIN_VALUE;
        for(int i=0; i<a.length-sequence; i++){
            int p1 = i;
            int total = 0;
            for(int j=0; j<sequence; j++){
                total += a[p1++];
            }
            result = Integer.max(result, total);
        }
        System.out.println("result = " + result);
    }

}
