package array;

import java.util.Scanner;

public class VisibleStudent {
    /**
     * 2. 보이는 학생
     * 설명
     * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
     * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
     *
     * 입력
     * 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
     *
     * 출력
     * 선생님이 볼 수 있는 최대학생수를 출력한다.
     */

    public static void main(String[] args) {
        VisibleStudent vs = new VisibleStudent();
        Scanner kb = new Scanner(System.in);
//        String input1 = kb.nextLine();
//        String input2 = kb.nextLine();
//        vs.solution(input1, input2);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(vs.solution1(n, arr));
    }


    //내 풀이
    private void solution(String input1, String input2) {
        int minValue = Integer.MIN_VALUE;
        int result = 0;
        String[] temp = input2.split(" ");
        for(String part : temp){
            if(minValue < Integer.parseInt(part)){
                result++;
                minValue = Integer.parseInt(part);
            }
        }
        System.out.println(result);
    }

    //풀이 1
    public int solution1(int n, int[] arr){
        int answer = 1, max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
}
