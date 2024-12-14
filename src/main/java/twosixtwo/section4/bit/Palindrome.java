package twosixtwo.section4.bit;

public class Palindrome {
    public static void main(String[] args) {
        /**
         *
         * 방법 1.
         * 입력받은 정수를 문자열르 변경한 뒤 앞, 뒤부터 하나하나 비교
         *
         * => 입력을 문자열 형태로 바꾸지 않을 경우 공간 복잡도 O(n)을 피할 수 있다.
         *
         * 방법 2.
         *   컨셉 :
         *     주어진 입력 x의 자릿수 n은 x에 밑이 10인 로그를 취한 결과와 같다.
         *     n = [log10x] + 1;
         *
         *   최하위 숫자는 x mod 10, 최상위 숫자는 x/10^(n-1)
         *
         */
        boolean palindromeNumber = isPalindromeNumber(12341);
        System.out.println("palindromeNumber = " + palindromeNumber);
    }

    public static boolean isPalindromeNumber(int x) {
        if (x<0)
            return false;
        final int numDigits = (int) (Math.floor(Math.log10(x))) + 1;
        int msdMask = (int)Math.pow(10, numDigits -1);
        for(int i=0; i<(numDigits/2); ++i){
            if(x / msdMask != x % 10) {
                return false;
            }
            x %= msdMask;
            x /= 10;
            msdMask /= 100;
        }
        return true;
    }
}
