package array;

import java.util.Scanner;

public class Decimals {
    /**
     * 5. 소수(에라토스테네스 체)
     * 설명
     * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
     * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
     *
     * 입력
     * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
     *
     * 출력
     * 첫 줄에 소수의 개수를 출력합니다.
     */

    public static void main(String[] args) {
        Decimals decimals = new Decimals();
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        System.out.println(decimals.solution(input));
    }

    private int solution(int input) {
        int answer = 0;
        int[] ch = new int[input+1];
        for(int i = 2; i<=2; i++){
            if(ch[i] == 0){
                answer++;
                for(int j=i; j<=input;j=j+1) ch[j] = 1;
            }
        }
        return answer;
    }
}
