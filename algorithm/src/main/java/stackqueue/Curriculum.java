package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum {
    public static void main(String[] args) {
        Curriculum cm = new Curriculum();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        System.out.println(cm.solution(str1, str2));
    }
    private String solution(String str1, String str2) {
        Queue<Character> q = new LinkedList<>();
        for (char temp : str1.toCharArray()) q.offer(temp);
        for (char x : str2.toCharArray()) {
            if(q.contains(x)){
                Character poll = q.poll();
                if (poll != x) return "NO";
            }
        }
        if(!q.isEmpty())
            return "NO";
        return "YES";
    }
}
