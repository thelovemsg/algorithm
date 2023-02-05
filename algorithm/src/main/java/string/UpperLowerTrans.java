package string;

import java.util.Scanner;

/**
 * 설명
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 */

public class UpperLowerTrans {
    //대문자 : 65 ~ 90
    //소문자 : 97 ~ 122

    // 첫번째 풀이
    public String solution1(String text){
        StringBuilder sb = new StringBuilder();
        for(char x : text.toCharArray()){
            if(Character.isUpperCase(x)){
                sb.append(Character.toLowerCase(x));
            }else if(Character.isLowerCase(x)){
                sb.append(Character.toUpperCase(x));
            }
        }
        return sb.toString();
    }

    public String solution2(String text){
        StringBuilder sb = new StringBuilder();
        for(char x : text.toCharArray()){
            if(x>=97 && x<=122) sb.append((char)x-32);
            else sb.append((char)x+32);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        UpperLowerTrans solution = new UpperLowerTrans();
        Scanner input =new Scanner(System.in);
        String str = input.next();
        System.out.println(solution.solution2(str));
    }

}
