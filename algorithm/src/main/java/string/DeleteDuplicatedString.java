package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DeleteDuplicatedString {

    public static void main(String[] args) {
        DeleteDuplicatedString dds = new DeleteDuplicatedString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(dds.solution1(str));
    }

    //내 풀이
    private String solution1(String str) {
        Map<Character, Character> map = new LinkedHashMap<>();
        for(char temp : str.toCharArray()){
            if(map.containsKey(temp)){
                continue;
            }else{
                map.put(temp, temp);
            }
        }
        StringBuilder sb = new StringBuilder();
        map.forEach((key,value) -> {
            sb.append(map.get(key));
        });

        return sb.toString();
    }

    //첫번째 풀이
    public String solution(String str){
        String answer = "";
        for(int i = 0; i < str.length(); i++){
//            System.out.println(str.charAt(i)+ " " + i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }
}
