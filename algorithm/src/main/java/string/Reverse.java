package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {

    /**
     * 설명
     * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
     * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
     *
     * 출력
     * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
     */

    //첫번째 풀이
    public ArrayList<String> solution2(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] s = x.toCharArray();
            int lt=0, rt=x.length();
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[lt] = s[rt];
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    //두번째 풀이
    public ArrayList<String> solution3(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);
        }
        return answer;
    }

    //내 풀이
    public void solution1(String[] str){
        for(String x : str){
            System.out.println("x = " + x);
            StringBuilder sb = new StringBuilder(x);
            System.out.println(sb.reverse().toString());
        }
    }

    public static void main(String[] args){
        Reverse reverse = new Reverse();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String[] str = new String[n];

        for(int i = 0; i < n; i++){
            str[i] = kb.next();
        }
        reverse.solution1(str);

    }

}
