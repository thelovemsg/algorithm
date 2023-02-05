package twosixtwo.section4.bit;

public class Multiply {

    /**
     * 곱셈 수행
     * @param args
     */
    public static void main(String[] args) {
        int add = addA(10, 5);
        System.out.println("add = " + add);

        long multiply = multiply(10, 5);
        System.out.println("multiply = " + multiply);
    }

    public static int addA(int x, int y){
        /**
         * e.g - 1
         * 10 => 1010(2)
         * 5  => 0101(2)
         *
         * e.g - 2
         * 11 => 0000 1011(2)
         * 5  => 0000 0101(2)
         */
        int xor = x^y; // 2번째 예시의 경우.. 0000 1110
        int and = x&y; // 2번째 예시의 경우.. 0000 0001
        and <<= 1; // 0000 0010
        while( (and & xor) != 0){ // 0000 1110 & 0000 0010 => 0000 0010
            int txor = and^xor; // 0010하고 1110을 xor하면...   => 0000 1100
            int tand = and&xor; // 0010하고 1110을 and하면...   => 0000 0010
            int uand = tand << 1; // 0을 한칸 왼쪽으로 shift하면  => 0000 0100
            and = uand; // 0000 0100
            xor = txor; // 0000 1100
        }
        return  xor^and; // 0000 0100 xor 0000 1100 = 0000 1000
    }

    public static long multiply(long x, long y){
        long sum = 0;
        while (x!=0) {
            if ((x&1) != 0){
                sum = add(sum, y);
            }
            x >>>= 1;
            y <<= 1;
        }
        return sum;
    }

    private static long add(long a, long b) {
        long sum = 0, carryin = 0, k=1, tempA=a,tempB=b;
        while(tempA!=0 || tempB != 0){
            long ak = a & k, bk = b & k;
            long carryout = (ak & bk) | (ak & carryin) | (bk & carryin);
            sum |= (ak ^ bk ^ carryin);
            carryin = carryout << 1;
            k <<= 1;
            tempA >>>=1;
            tempB >>>=1;
        }

        return sum | carryin;
    }

}
