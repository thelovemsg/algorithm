package string;

import java.util.Scanner;

public class ShortestNumber {

    /**
     * 설명
     * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
     * 문자열의 길이는 100을 넘지 않는다.
     *
     * 출력
     * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
     */

    public static void main(String[] args) {
        ShortestNumber pd2 = new ShortestNumber();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char target = kb.next().charAt(0);
        pd2.solution(str, target);
    }

    //내 풀이 - 잘 몰라서 흐름만 참고
    private void solution(String str, char target) {
        int[] answer = new int[str.length()];
        int p = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                p=0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        p = 0;

        for(int i = str.length()-1; i >= 0; i--){
            if(str.charAt(i) == target){
                p=0;
                answer[i] = p;
            }else{
                p++;
                if(answer[i]>p)
                    answer[i] = p;
            }
        }

        for(int temp : answer){
            System.out.print(temp + " ");
        }
    }

    public int[] solution1(String s, char t){
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==t){
                p=0;
                answer[i]=p;
            }else{
                p++;
                answer[i]=p;
            }
        }

        p = 1000;

        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == t) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }

        return answer;
    }

}
