package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OutputBigNumber {

    /**
     * 1. 큰 수 출력하기
     * 설명
     *
     * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
     * (첫 번째 수는 무조건 출력한다)
     *
     * 입력
     * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
     *
     * 출력
     * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
     */

    public static void main(String[] args) {
        OutputBigNumber obn = new OutputBigNumber();
        Scanner kb = new Scanner(System.in);
        String input1 = kb.nextLine();
        String input2 = kb.nextLine();
        obn.solution(input1, input2);
    }

    //내 풀이
    private void solution(String input1, String input2){
        String[] tempString = input2.split(" ");
        Arrays.stream(tempString).forEach(m -> {
            if(Integer.parseInt(input1) < Integer.parseInt(m)){
                System.out.print(m+" ");
            }
        });
    }

    //풀이 1
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i = 1; i<n; i++){
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

}
