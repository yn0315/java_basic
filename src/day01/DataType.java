package day01;

//이건 컨트롤 시프트 f10눌러야 실행

public class DataType {

    public static void main(String[] args) {

        //정수형
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 2147483648L;//리터럴도 롱타입으로 변경해줘야 함 안그럼 리터럴저장공간 부족

        //실수형

        float f1 = 3.84848484848484F;//4byte //끝에 변경해줘야 함
        double d1 = 3.84848484844848484848484;//8byte

        System.out.println("d1 = " + d1);
        System.out.println("f1 = " + f1);

        double n = 0.0;
        for (int i = 0; i < 100; i++) {

            n += 0.1;
        }
        System.out.println("0.1을 100번 더한 결과: " + n);

        //논리형
        boolean b1 = true;
        boolean b2 = false;
        //자바의 논리형은 js처럼 falsy값이 존재하지 않는다.
//        boolean b3 = 0;//이렇게 못 씀
//        boolean b4 = null;
//        boolean b5 = "true";
//        boolean b6 = False;
        //무한루프 반드시 트루만 써야 함
//        while (true) {
//
//        }

        //문자형
        //char : 단일문자를 저장!!, 홑따옴표 사용!!
        char c1 = 'A';
        //String: 문자열을 저장, 겹따옴표 사용, 기본타입은 아님
        String s1 = "aaaa";

        //컨트롤 d누르면 줄복사
        System.out.println("100" + "200");
        //숫자와 문자열의 덧셈은 문자열 덧셈처리
//        System.out.println(100 + "200");
    }
}
