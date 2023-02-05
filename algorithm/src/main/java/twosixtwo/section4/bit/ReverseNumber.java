package twosixtwo.section4.bit;

public class ReverseNumber {
    public static void main(String[] args) {
        long reserve = reserve(1234);
        System.out.println("reserve = " + reserve);
    }
    public static long reserve(int x) {
        long result = 0;
        long xRemaining = Math.abs(x);
        while (xRemaining != 0){
            result = result * 10 + xRemaining % 10;
            xRemaining /= 10;
        }
        return x<0 ? -result : result;
    }
}
