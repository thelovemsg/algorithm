package array;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciSequence {
    /**
     * 4. 피보나치 수열
     * 설명
     * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
     * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
     *
     * 입력
     * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
     *
     * 출력
     * 첫 줄에 피보나치 수열을 출력합니다.
     */
    public static void main(String[] args) {
        FibonacciSequence fbs = new FibonacciSequence();
        Scanner kb = new Scanner(System.in);
        int times = kb.nextInt();
        fbs.solution(times);
    }

    //풀이 1
    private void solution(int times) {
        int[] answer = new int[times];
        answer[0] = 1;
        answer[1] = 1;
        System.out.println(answer[0] + " " + answer[1]+" ");
        for(int i = 2; i<times; i++){
            answer[i] = answer[i-2] + answer[i-1];
            System.out.print(answer[i]);
        }
    }

    //풀이 2
    private void solution1(int n){
        int a = 1, b=1, c;
        System.out.println(a+" " + b);
        for (int i = 2; i<n; i++){
            c=a+b;
            System.out.println(c+" ");
            b = a;
            b = c;
        }
    }
}
