package twopointerandslidingwindow;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindCommonElements {

    /**
     * 설명
     * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
     *
     *
     * 입력
     * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
     * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
     * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
     * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
     * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
     *
     * 출력
     * 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
     *
     * 5
     * 1 3 9 5 2        =>      2 3 5
     * 5
     * 3 2 5 7 8
     *
     */

    public static void main(String[] args) {
        FindCommonElements fce = new FindCommonElements();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = kb.nextInt();
        }

        fce.solution(n,m,a,b);

    }

    //강의 풀이 => 한번 정렬하고 하니 for문을 2중으로 할 필요가 없다.
    private void solution1(int n, int m, int[] a, int[] b){
        List<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(p1<n && p2<m){
            if(a[p1] < b[p2]) {
                p1++;
                continue;
            }else if(a[p1] > b[p2]){
                p2++;
                continue;
            }
            if(a[p1] == b[p2]){
                answer.add(a[p1++]);
                p2++;
            }
        }
        for (Integer integer : answer) {
            System.out.print(integer+" ");
        }

    }

    //첫번째 풀이 => 효율이 O(n^2) => 전부다 돌아야 하니까 느리다.
    private void solution(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                if(a[i] == b[j]) {
                    answer.add(a[i]);
                }
            }
        }

        answer.sort(Comparator.naturalOrder());
        for (Integer integer : answer) {
            System.out.print(integer+" ");
        }

    }

}
