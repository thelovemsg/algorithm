package vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorTest {

    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<Integer>(); // 타입 지정
        Vector<Integer> vector2 = new Vector<>(); // 타입 생략 가능
        Vector<Integer> vector3 = new Vector<>(10); // 초기 용량(Capacity) 설정
        Vector<Integer> vector4 = new Vector<>(10, 10); // 초기 용량, 증가량 설정
        Vector<Integer> vector5 = new Vector<>(vector1); // 다른 Collection값으로 초기화
        Vector<Integer> vector6 = new Vector<>(Arrays.asList(1, 2, 3, 4, 5)); // Arrays.asList()

    }
}
