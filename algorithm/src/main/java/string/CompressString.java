package string;

import java.util.Scanner;

public class CompressString {

    /**
     * 설명
     * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
     * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
     * 단 반복횟수가 1인 경우 생략합니다.
     *
     * 입력
     * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
     *
     * 출력
     * 첫 줄에 압축된 문자열을 출력한다.
     */

    public static void main(String[] args) {
        CompressString cn = new CompressString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        cn.solution(str);
    }

    //내 풀이 접근법이 틀림...
    // 이유 => 이전 것이 아니라 다음 것을 비교해야 현재 형식으로 가능.
    public void solution(String str){
        int count = 0;
        char prevChar = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(char temp : str.toCharArray()){
            if(temp == prevChar){
                count++;
            }else{
                if(count != 0 && count != 1)
                    sb.append(temp+""+count);
                else
                    sb.append(temp);
                count = 0;
            }
            prevChar = temp;
        }
        System.out.println(sb.toString());
    }

    //풀이 1
    public String solution1(String s){
        String answer="";
        s=s+" ";
        int cnt = 1;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else{
                answer+=s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }

        return answer;

    }
}
