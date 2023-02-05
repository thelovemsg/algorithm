package twosixtwo.section4.bit;

public class Divide {
    public static void main(String[] args) {
        long divide = divide(11, 2);
        System.out.println("divide = " + divide);
    }

    /**
     * (아 이거 왜케 어려워? 무슨말이여?)
     *
     * 무식한 방법으로 푼다면 y보다 크기가 작아질 때까지 x에서 y를 반복해서 빼면 된다.
     *   => 조금만 개선하면 더 효율적인 알고리즘을 찾을 수 있다.
     *
     * 2^k*y <= x 를 만족하는 가장 큰 k를 찾은 뒤 x에서 2^k를 빼고 x^k의 몫을 더한다. (????)
     *
     * 예를 들어...
     *
     * 11
     *
     * @param x
     * @param y
     * @return
     */
    public static long divide(long x, long y) {
        long result = 0;
        int power = 32;
        long yPower = y << power;
        while (x >= y){
            while (yPower > x){
                yPower >>>= 1;
                --power;
            }

            result += 1 << power;
            x -= yPower;
        }
        return result;
    }
}
