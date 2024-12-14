package leetcode.list;

public interface List<T> {
    void add(T element);          // 요소 추가
    void add(int index, T element); // 특정 위치에 요소 추가
    T get(int index);             // 요소 조회
    T remove(int index);          // 요소 삭제
    int size();                   // 리스트 크기 반환
    boolean isEmpty();            // 리스트가 비어 있는지 확인
}