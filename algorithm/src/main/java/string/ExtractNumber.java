package string;

import java.util.Scanner;

/**
 * 설명
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 * 입력
 * 첫 줄에 숫자가 썩인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 출력
 * 첫 줄에 자연수를 출력합니다.
 */
public class ExtractNumber {
    public static void main(String[] args) {
        ExtractNumber sn = new ExtractNumber();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(Integer.parseInt(sn.solution2(str)));
    }

    //내 풀이
    private void solution(String str) {
        String temp = str.replaceAll("[a-zA-Z]", "");
        if(temp.charAt(0) == 0){
            String substring = temp.substring(1);
            System.out.println(Integer.parseInt(substring));
        }else{
            System.out.println(Integer.parseInt(temp));
        }
    }

    //풀이 1
    public int solution1(String s){
        int answer = 0;
        for(char x : s.toCharArray()){
            if(x>=48 && x<=57) answer = answer*10 + (x-48);
        }
        return answer;
    }

    //풀이 2
    public String solution2(String s){
        String answer = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)) answer+=x;
        }
        return answer;
    }

}
