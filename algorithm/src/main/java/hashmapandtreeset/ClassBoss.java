package hashmapandtreeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassBoss {

    public static void main(String[] args) {
        ClassBoss cb = new ClassBoss();
        Scanner kc = new Scanner(System.in);
        int num = kc.nextInt();
        String str = kc.next();
//        cb.solution(num, arr);
        cb.solution1(num,str);
    }

    //풀이 1
    private void solution1(int num, String str) {
        char answer;
        Map<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(char x : map.keySet()){
            max = Math.max(max, map.get(x));
        }
        System.out.println("max = " + max);
    }

    //내 풀이
    private void solution(int num, String arr) {
        Map<String, Integer> map = new HashMap<>();
        for(String temp : arr.split("")){
            map.put(temp, map.getOrDefault(temp,0)+1);
        }
        //map에서 최대값만 찾으면 된다.
        System.out.println("map = " + map);
    }

}
