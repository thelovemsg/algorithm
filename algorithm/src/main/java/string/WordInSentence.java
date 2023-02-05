package string;

import java.util.PropertyPermission;
import java.util.Scanner;

/**
 * 설명
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 * 단어를 답으로 합니다.
 *
 * ex : it is time to study
 */
public class WordInSentence {

    /**
     * 내 풀이
     */
    public String solution1(String str){
        String answer = "";
        String[] temp = str.split(" ");

        for(String part : temp){
            if(answer.length() < part.length()){
                answer = part;
            }
        }

        return answer;
    }

    // 첫번째 풀이
    public String solution2(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if(len > m){
                m = len;
                answer = x;
            }
        }

        return answer;
    }

    //두번째 풀이
    public String solution3(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) != -1){
            String temp = str.substring(0, pos);
            int len = temp.length();
            if(len>m){
                m=len;
                answer=temp;
            }
            str = str.substring(pos+1);
        }

        if(str.length()>m) answer = str;

        return answer;
    }

    public static void main(String[] args){
        WordInSentence wis = new WordInSentence();
        Scanner input =new Scanner(System.in);
        String str = input.nextLine();

        System.out.println(wis.solution1(str));
        return;
    }

}
