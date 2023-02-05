package string;

import java.util.Scanner;

public class Palindrome2 {

    public static void main(String[] args) {
        Palindrome2 pd2 = new Palindrome2();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(pd2.solution(str));
    }

    public String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) return "YES";
        return "NO";
    }

}
