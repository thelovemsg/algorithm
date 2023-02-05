package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveBracketWords {

    /**
     * 2. 괄호문자제거
     * 설명
     * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
     *
     * 출력
     * 남은 문자만 출력한다.
     */

    public static void main(String[] args) {
        RemoveBracketWords rbw = new RemoveBracketWords();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();

        System.out.println(rbw.solution(a));

    }

    //내 풀이 - 해결~ 뿌듯
    private String solution(String a) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char temp : a.toCharArray()){
            if(temp == '(')
                stack.push(temp);
            if(temp == ')')
                stack.pop();
            if(stack.isEmpty() && temp != '(' && temp != ')')
                answer += temp;
        }
        return answer;
    }

    //풀이
    public String solution1(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == ')'){
                while(stack.pop() != '(');
            }else stack.push(x);
        }
        for(int i=0; i<stack.size(); i++) answer += stack.get(i);
        return answer;
    }

}
