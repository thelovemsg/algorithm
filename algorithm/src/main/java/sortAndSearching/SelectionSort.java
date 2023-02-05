package sortAndSearching;

import java.util.Scanner;

public class SelectionSort {

    /**
     * 1. 선택 정렬
     * 설명
     * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
     * 정렬하는 방법은 선택정렬입니다.
     *
     * 입력
     * 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
     * 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
     *
     * 출력
     * 오름차순으로 정렬된 수열을 출력합니다.
     */

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

//        ss.solution(n, arr);
    }


    //내 풀이
    private void solution(int n, int[] arr) {
//        13 5 11 7 23
        // 13 일 경우 5 11 7 23
        // =>
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public int[] solution1(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            int idx=i;
            for(int j=i+1;j<n; j++){
                if(arr[j]<arr[idx]) idx=j;
            }
            int tmp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=tmp;
        }
        return arr;
    }

}
