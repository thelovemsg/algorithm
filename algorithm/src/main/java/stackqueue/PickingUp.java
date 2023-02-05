package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class PickingUp {

    public static void main(String[] args) {
        PickingUp pu = new PickingUp();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = kb.nextInt();
            }
        }
        int m=kb.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i]=kb.nextInt();
        }
        System.out.println(pu.solution(board,moves));
    }

    private int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1]!=0){
                    int tmp=board[i][pos-1];
                    board[i][pos-1]=0;
                    if(!stack.isEmpty() && tmp ==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }else stack.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }

}
