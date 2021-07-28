package day02;

public class PlusMinusOprater {

    public static void main(String[] args) {

        int x = 3;
        int y = ++x + 5 * 3;//덧셈보다 ++먼저 계산함
        int z = 5 * y-- + x++ - --y;//5*y 먼저 한 후 y 값을 내려줌..x++도 같은 방식
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
