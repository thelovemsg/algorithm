package twosixtwo.section4;

/**
 * 두 개의 직사각형이 주어졌을 때, 이 둘이 겹치는지 확인하는 프로그램을 작성하라.
 * 만일 겹친다면, 겹치는 직사각형의 정보를 반환하라.
 *
 * 이 문제에서는 x, y 축에 평행한 직사각형만 고려할 것이다.
 */
public class problem_4_11 {
    public static void main(String[] args) {
        /**
         * 겹치는 모든 경우를 생각하기 보다는 겹치지 않는 직사각형의 경우를 생각하는게 낫다.
         */
        Rectangle rectangle = intersectRectangle(new Rectangle(1, 2, 3, 4), new Rectangle(5, 3, 2, 4));
        System.out.println("rectangle = " + rectangle);
    }

    public static class Rectangle{
        int x; //왼쪽 아래 꼭지점 - x
        int y; //왼쪽 아래 꼭지점 - y
        int width;
        int height;

        public Rectangle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "x=" + x +
                    ", y=" + y +
                    ", width=" + width +
                    ", height=" + height +
                    '}';
        }
    }

    public static Rectangle intersectRectangle(Rectangle R1, Rectangle R2) {
        if( !isIntersect(R1, R2)){
            return new Rectangle(0,0,-1, -1);
        }

        return new Rectangle(Math.max(R1.x, R2.x), Math.max(R1.y, R2.y),
        Math.min(R1.x + R1.width, R2.x + R2.width) - Math.max(R1.x, R2.x),
        Math.min(R1.y + R1.height, R2.y + R2.height) - Math.max(R1.y, R2.y));
    }

    /**
     * x축과 y축의 범위가 서로 겹친다는 점을 어떻게 표현하지?
     *
     * 내 생각 & 풀이
     *
     * 겹친다는 것은 기준으로 잡은 직사각형의 꼭지점 + 너비가 다른 직사각형의 꼭지점보다 크면
     * 겹친다고 할 수 있다.
     *
     * 두개의 직사각형이 있다고 할 때, (각각 R1, R2)
     * R1에서 R2를 바라볼 때 X1+Xw 가 X2보다 크다면 겹치는 것이다
     *
     * 예를 들자면 생성자 순서대로(1,2,3,4)인 R1과 (5,3,2,4)인 R2이 있다고 하자.
     * R1가 R2를 바라볼 때, R2가 R1를 바라볼 때 x축과 y축도 비교해야 하므로
     * 총 4개의 식이 필요하다.
     *
     * R1에서 x축 기준으로 바라볼 때는 X1+X1(width) >= X2인 경우 겹친다고 할 수 있다.
     * R2에서 x축 기준으로 바라볼 때는 X2+X2(width) >= X1인 경우 겹친다고 할 수 있다.
     * R1에서 y축 기준으로 바라볼 때는 Y1+Y1(width) >= Y2인 경우 겹친다고 할 수 있다.
     * R2에서 y축 기준으로 바라볼 때는 Y2+Y2(width) >= Y1인 경우 겹친다고 할 수 있다.
     *
     * 하나라도 만족하지 못하는 경우는 겹치지 않는다는 것이다.
     * (더럽게 헷갈리네)
     */
    private static boolean isIntersect(Rectangle R1, Rectangle R2) {
        return R2.x + R2.width >= R1.x &&
               R1.x + R1.width >= R2.x &&
               R2.y + R2.height >= R1.y &&
               R1.y + R1.height >= R2.y ;
    }
}


