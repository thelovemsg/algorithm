package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class PrefixCal {
    public static void main(String[] args) {
        PrefixCal pc = new PrefixCal();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(pc.solution(str));
    }

    private int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) stack.push(x-48);
            else{
                int rt=stack.pop();
                int lt=stack.pop();
                if(x=='+') stack.push(lt+rt);
                else if(x=='-') stack.push(lt-rt);
                else if(x=='*') stack.push(lt*rt);
                else if(x=='/') stack.push(lt/rt);
            }
        }
        answer = stack.get(0);

        return answer;
    }
}
