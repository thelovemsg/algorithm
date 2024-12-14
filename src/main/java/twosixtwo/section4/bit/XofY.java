package twosixtwo.section4.bit;

public class XofY {
    public static void main(String[] args) {
        double power = power(3.0, 5);
        System.out.println("power = " + power);
    }

    public static double power(double x, int y) {
        double result = 1.0;
        long power = y;
        if (y<0) {
            power -= power;
            x = 1.0 / x;
        }
        while (power != 0) {
            if ((power & 1) != 0){
                result *= x;
            }
            x *= x;
            power >>>= 1;
        }
        return result;
    }
}
