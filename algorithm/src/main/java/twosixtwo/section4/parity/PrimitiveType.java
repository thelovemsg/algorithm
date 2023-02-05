package twosixtwo.section4.parity;

/**
 * 262가지 문제로 정복하는 코딩 인터뷰
 *  챕터 4
 *  기본 자료형 이해하기
 */
public class PrimitiveType {

    public static void main(String[] args) {
        short i = countBits(10);
        System.out.println("i = " + i);

        System.out.println("6&4 : " + (6&4));

        System.out.println("8>>1 : " + (8>>1));

        System.out.println("-16>>1 : " + (-16>>1));

        System.out.println("1<<10 : " + (1<<10));

        System.out.println("~0 : " + (~0));



    }

    public static short countBits(int x){
        // example : 10을 입력
        short numBits = 0;
        while (x != 0){

            numBits += (x&1);
            x >>>=1;
        }
        return numBits;
    }

}
