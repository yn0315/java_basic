package day09;

public class MethodReturn {

    //리턴값이 없는 메서드: 메서드가 코드만 실행하고
    //호출부로 값을 전달하지 않는 경우

    static void showMultiply(int n1, int n2) {
        System.out.printf("%d x %d = %d", n1, n2, n1 * n2);
        //리턴할 게 없을 때 타입을 void로 줌
    }

    static int add(int n1, int n2) {
        return n1 + n2;
        //System.out.println("안녕");//리턴다음에는 쓸 수 없음
    }

    static void sayHello(String name) {
        if (name.length() > 5) {
            System.out.println("이름이 너무길어 꺼지세요");
            return;
        }
        System.out.println(name + "님 하이");
    }

    //모든 메서드의 리턴값은 오직 한개
    //두 개의 정수를 전달받아 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 리턴

    static int[] operateAll(int n1, int n2) {
        return new int[]{n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }

    public static void main(String[] args) {
        //리턴값이 없는 void타입은 단독호출에 사용
        showMultiply(5, 8);
        //리턴값이 없어서 변수에 담을 수 없음
        int result = add(1, 2);

        //이건 리턴값이 있어서 가능
        showMultiply(add(5,5), add(3,3));

        //얘는 리턴값이 없어서 불가능
        //add(showMultiply(3,3), showMultiply(5,5));(X)

        System.out.println("\n+==========================================");
        sayHello("홍길동");
        sayHello("king god general emperor master park");
        System.out.println("==============================================");

        int[] operList = operateAll(10,5);
        System.out.println("덧셈결과" + operList[0]);
        System.out.println("뺄셈결과" + operList[1]);
        System.out.println("곱셈결과" + operList[2]);
        System.out.println("나눗셈결과" + operList[3]);

    }
}
