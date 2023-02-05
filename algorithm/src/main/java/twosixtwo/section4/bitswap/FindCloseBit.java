package twosixtwo.section4.bitswap;

public class FindCloseBit {
    public static void main(String[] args) {
        System.out.println(10>>>0);
        System.out.println(10>>>1);
        System.out.println(closestIntSameBit(27));
    }

    /**
     * 같은 무게를 가진 가까운 정수 찾기
     *  여기서 같은 무게란, 이진수 중에서 1의 갯수가 동일한 수이다.
     *  가정 : x는 음이 아닌 정수
     */

    public static long closestIntSameBit(long x) {
        //
        final int NUM_UNSIGNED_BITS = 63;
        for(int i=0; i<NUM_UNSIGNED_BITS -1; ++i){
            if(((x >>> i) & 1) != ((x >>> (i+1)) & 1)){
                System.out.println((1L << i));
                System.out.println((1L << (i+1)));
                x ^= (1L << i) | (1L << (i+1)); //i번째 비트와 (i+1)번째 비트를 스왑한다.
                return x;
            }
        }
        throw new IllegalArgumentException("All bits are 0 or 1");
    }

}
