package day02;

public class LogicalOperator {

    public static void main(String[] args) {

        int x = 10, y = 20;
        boolean result1 = (x != 10) && (++y == 21);// 두개짜리는 앞에서 false뜨면 우항 연산 안함
        boolean result2 = (x == 10) || (++y == 21);//앞에서 true뜨면 우항 연산 안함
        //하나짜리 쓰는게 안전하고 메모리절약이나 빠르게 판단을 요하는 경우 두개 사용

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);//그래서 20 나옴


    }
}
