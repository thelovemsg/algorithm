package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class RightBracket {

    /**
     * 1. 올바른 괄호
     *
     * 설명
     * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
     * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
     *
     * 입력
     * 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
     *
     * 출력
     * 첫 번째 줄에 YES, NO를 출력한다.
     */

    public static void main(String[] args) {
        RightBracket rb = new RightBracket();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        System.out.println(rb.solution(a));
    }

    //강의풀이
    public String solution1(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        return answer;
    }


    //내 풀이
    //생각해보니 굳이... )일 경우 한번 더 그것을 확인할 필요가 없음.
    private boolean solution(String a) {
        Stack<Character> stack = new Stack<>();

        for(char temp : a.toCharArray()){
            if(temp==')'){
                if(stack.isEmpty()) return false;
//                Character pop = stack.pop();
//                if(pop!='(')
//                    return false;
                stack.pop();
            }else {
                stack.push(temp);
            }
        }

        return stack.isEmpty() ? true : false;
    }

}
