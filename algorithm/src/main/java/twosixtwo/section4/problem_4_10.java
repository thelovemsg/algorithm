package twosixtwo.section4;

public class problem_4_10 {
    /**
    * 여섯 명의 친구들이 앞면이 나올 확률과 뒷면이 나올 확률이 같은 동전을 이용해 자동차 운전자를 뽑으려 한다.
    * 절차는 모두에게 공평해야 한다. 이런 상황을 해결할 수 있는 문제를 풀어보자.
    *
    * => 0 혹은 1을 같은 확률로 생성해 내는 임의의 숫자 생성기가 주어졌을 때,
     *   a와 b 사이의 임의의 자연수 i를 생성하려면 어떻게 해야하나?
    *
    * 아니 무슨 소리야...?
    * */

    public static void main(String[] args) {

    }

    public static int uniformRandom(int lowerBound, int upperBound) {
        int numberOfOutcomes = upperBound - lowerBound + 1, result;
        do{
            result = 0;
            for (int i=0; (1<<i) < numberOfOutcomes; ++i) {
                //zeroOneRandom은 임의의 숫자를 생성하는 함수
                result = (result << 1) | (int)Math.random();
            }
        } while (result >= numberOfOutcomes);
        return result + lowerBound;
    }


}
