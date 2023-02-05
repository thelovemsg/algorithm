package twopointerandslidingwindow;

import java.util.Scanner;

public class SequenceParts {

    /**
     * 설명
     * N개의 수로 이루어진 수열이 주어집니다.
     * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
     * 만약 N=8, M=6이고 수열이 다음과 같다면
     * 1 2 1 3 1 1 1 2
     * 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
     *
     * 입력
     * 첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
     * 수열의 원소값은 1,000을 넘지 않는 자연수이다.
     *
     * 출력
     * 첫째 줄에 경우의 수를 출력한다.
     *
     * 예시
     *
     * 8 6
     * 1 2 1 3 1 1 1 2   =>    3
     *
     */

    public static void main(String[] args) {
        SequenceParts sp = new SequenceParts();
        Scanner sc = new Scanner(System.in);

        int[] first = new int[2];
        for (int i=0; i<2; i++) {
            first[i] = sc.nextInt();
        }

        int[] second = new int[first[0]];
        for(int i=0; i<first[0]; i++){
            second[i] = sc.nextInt();
        }

        sp.solution(first[0], first[1], second);
        
    }

    //풀이 1
    public void solution1(int n, int m, int[] arr){
        int answer=0, sum=0, lt=0;
        for(int rt=0; rt<n; rt++){
            sum+=arr[rt];
            if(sum==m) answer++;
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m) answer++;
            }
        }
    }

    //아... 이중 포문으로 하려니 취지에 맞지가 않음...
    // n^2 => n으로 할 방법을 몰랏음...
    private void solution(int n, int m, int[] second) {
        int pointer = 0;
        int answer = 0;
        int total = 0;
        for(int i=pointer; i<n; ){
            total += second[i];
            if(total == m){
                answer++;
                pointer++;
            } else if(total > m){
                pointer++;
            }


        }
        System.out.println("answer = " + answer);
    }

}
