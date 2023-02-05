package sortAndSearching;

import java.util.*;

public class CoordinateSort {

    /**
     * 7. 좌표 정렬
     * 설명
     * N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
     * 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
     *
     * 입력
     * 첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
     * 두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.
     *
     * 출력
     * N개의 좌표를 정렬하여 출력하세요.
     *
     * 5
     *
     * 2 7      1 2
     * 1 3      1 3
     * 1 2  =>  2 5
     * 2 5      2 7
     * 3 6      3 6
     */

    public static void main(String[] args) {
        CoordinateSort cs = new CoordinateSort();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x=kb.nextInt();
            int y=kb.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);
        for (Point point : arr) {
            System.out.println(point.x + " " + point.y);
        }
//        int[][] arr = new int[n][2];
//        for(int i=0; i<2; i++){
//            for(int j=0; j<n; j++){
//                arr[j][i] =  kb.nextInt();
//            }
//        }
//        cs.solution(n, arr);
    }

    private void solution(int n, int[][] arr) {
        int[] resultArray = new int[2];
        List<int[]> result = new ArrayList<int[]>();
        for(int i=0; i<2; i++){
            for(int j=0; j<n; j++){
                resultArray[i] = arr[i][j];
            }
            result.add(resultArray);
        }
    }
}

class Point implements Comparable<Point> {
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        return this.x - o.x;
    }
}