package string;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome pd = new Palindrome();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        pd.solution(str);
    }

    //내 풀이
    private void solution(String str) {
        String toUpperAll = str.toUpperCase();
        for(int i = 0; i < toUpperAll.length()/2; i++){
            if(toUpperAll.charAt(i) != toUpperAll.charAt(str.length()-i-1)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    //풀이 1
    public String solution1(String str) {
        String answer = "YES";
        int len = str.length();
        for(int i = 0;i < len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }

        return answer;
    }

    //풀이 2
    public String solution2(String str) {
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp))
            return "NO";
        return "YES";
    }

}
