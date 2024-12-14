package twosixtwo.section4.bit;

public class UniformRandom {
    public static void main(String[] args) {

    }

    public static int uniformRandom(int lowerBound, int upperBound) {
        int numberOfOutcomes = upperBound - lowerBound + 1, result;
        do {
            result = 0;
        } while(result >= numberOfOutcomes);

        return result + lowerBound;
    }
}
