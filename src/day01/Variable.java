package day01;//지우면 큰일 남

//alt + 1 누르면 옆에 열렸다 닫혔다 함
//enter 안 눌리면 insert키 누르기
public class Variable {
    //main 즉시실행함수와 같은 거, 실행코드는 main 함수 내에 작성해야 한다.
    public static void main(String[] args) {

        //변수선언
        int number;//타입을 꼭 써야함
        number = 100;//변수 초기화 꼭 해줘야 함
        System.out.println(number);

        //선언타입이 다른 값은 저장 불가
        int point = 78;
//        point = 78.99;

        int copyNum = number * 3;
        System.out.println(copyNum);
        System.out.println("copyNum = " + copyNum);//soutv 단축키

        //문자열 저장시에는 String타입 사용// S를 꼭 대문자로
        //문자열값에는 반드시 겹따옴표만 사용!!!!c언어도!!
        String nickName = "뽀로로";

        //자바  변수 스코프(유효범위) : 블록 스코프
        int n1 = 10, n2 = 20;

        if (true) {

            int n3 = n1 + n2;
            System.out.println("n3 = " + n3);

        }//end if

    }//end main

}//end class
