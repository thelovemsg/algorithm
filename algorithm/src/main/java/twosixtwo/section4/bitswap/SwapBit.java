package twosixtwo.section4.bitswap;

public class SwapBit {
    public static void main(String[] args) {
        swapBits(14,1,0);
    }

    /**
     * 각자 비트를 뒤집는 것이 서로 스왑을 하는것과 동일한 결과를 낸다.
     * @param x
     * @param i
     * @param j
     * @return
     */
    public static long swapBits(long x, int i, int j){
        if(((x>>>i) & 1) != ((x >>> j) & 1)) {
            /*
              ex1)
              11000 (24) 의 3번째와 0번째를 스왑
               => 11000
                  10001

                  1L << 3 = 1000(2)
                  1L << 0 = 1(2)

                      11000
                  xor 01001
                  ---------
                      10001
             */
            long bitMask = (1L << i) | (1L << j);
            x ^= bitMask;
        }
        return x;
    }
}
