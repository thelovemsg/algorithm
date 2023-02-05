package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrincessRescue {

    public static void main(String[] args) {
        PrincessRescue pr = new PrincessRescue();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int  k = kb.nextInt();
        System.out.println(pr.solution(n, k));
    }

    private int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();

        while (!q.isEmpty()) {
            for(int i=1; i<k; i++) q.offer(q.poll());
            q.poll();
            if(q.size()==1) answer= q.poll();
        }
        return answer;
    }

}
