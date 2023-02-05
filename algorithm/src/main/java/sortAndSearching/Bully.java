package sortAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bully {
    /**
     * 6. 장난꾸러기
     * 설명
     * 새 학기가 시작되었습니다. 철수는 새 짝꿍을 만나 너무 신이 났습니다.
     * 철수네 반에는 N명의 학생들이 있습니다.
     * 선생님은 반 학생들에게 반 번호를 정해 주기 위해 운동장에 반 학생들을 키가 가장 작은 학생부터 일렬로 키순으로 세웠습니다.
     * 제일 앞에 가장 작은 학생부터 반 번호를 1번부터 N번까지 부여합니다. 철수는 짝꿍보다 키가 큽니다.
     * 그런데 철수가 앞 번호를 받고 싶어 짝꿍과 자리를 바꿨습니다.
     * 선생님은 이 사실을 모르고 학생들에게 서있는 순서대로 번호를 부여했습니다.
     * 철수와 짝꿍이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때 철수가 받은 번호와 철수 짝꿍이 받은 번호를
     * 차례로 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 번째 줄에 자연수 N(5<=N<=100)이 주어진다.
     * 두 번째 줄에 제일 앞에부터 일렬로 서있는 학생들의 키가 주어진다.
     * 키(높이) 값 H는 (120<=H<=180)의 자연수 입니다.
     *
     * 출력
     * 첫 번째 줄에 철수의 반 번호와 짝꿍의 반 번호를 차례로 출력합니다.
     *
     * 예시
     * 9                                        =>     3 8
     * 120 125 152 130 135 135 143 127 160
     */
    public static void main(String[] args) {
        Bully b = new Bully();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =  kb.nextInt();
        }
//        b.solution(n, arr);
        System.out.println(b.solution1(n,arr));
    }


    private ArrayList<Integer> solution1(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] temp = arr.clone();
        Arrays.sort(temp);
        for(int i=0; i<n; i++){
            if(arr[i]!=temp[i]) answer.add(i+1);
        }
        return answer;
    }

    //???? 내 풀이 안됨. 왜그런지 모르겟으나 서로 안맞음
    private void solution(int n, int[] arr) {
        int[] result = new int[2];
        int pos = 0;
        
        for(int i=0; i<n-1; i++){
            /**
             * 120 > 125 i = 0
             * 125 > 152 i = 1
             * 152 > 130 => i = 2 => pos = 3 저장
             * 130 > 135 i = 3
             * 135 > 135 i = 4
             * 135 > 143 i = 5
             * 143 > 127 => i = 6
             **/
            if(arr[i] > arr[i+1]){
                System.out.println("i+1 = " + i+1);
                result[pos] = i+1;
                pos++;
            }
        }

        for (int x : result) {
            System.out.println("x = " + x);
        }

    }
}
