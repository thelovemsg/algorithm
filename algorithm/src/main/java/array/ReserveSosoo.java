package array;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Scanner;

public class ReserveSosoo {

    /**
     * 설명
     * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
     * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
     * 첫 자리부터의 연속된 0은 무시한다.
     *
     * 입력
     * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
     * 각 자연수의 크기는 100,000를 넘지 않는다.
     *
     * 출력
     * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
     */
    
//    public static void main(String[] args) {
//        ReserveSosoo reserveSosoo = new ReserveSosoo();
//        Scanner kb = new Scanner(System.in);
//        int times= kb.nextInt();
//        String arrays = kb.nextLine();
//        reserveSosoo.solution(times, arrays);
//    }
//
//    private void solution(int times, String arrays) {
//        for(int i = 0; i < times; i++){
//            StringBuilder sb = new StringBuilder(arrays.split(" ")[i]);
//            int tempInt = Integer.parseInt(String.valueOf(sb.reverse()));
//
//        }
//        return false;
//    }
    public static void main(String[] args) {
        ReserveSosoo rs = new ReserveSosoo();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : rs.solution(n, arr)){
            System.out.println(x+ " ");
        }
    }

    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0){
                int t = tmp%10;
                res = res*10+t;
                tmp=tmp/10;
            }
            if(isPrime(res)){
                answer.add(res);
            }
        }

        return answer;
    }

    public boolean isPrime(int num){
        if(num == 1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
