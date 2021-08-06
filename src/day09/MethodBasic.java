package day09;

// 1. 자바의 메서드는 클래스 내부, 메서드 외부에 선언합니다.
// 2. 메서드는 메서드 안에서만 호출할 수 있습니다.
public class MethodBasic {

    //1~ x까지 총합을 구해서 리턴하는 함수 정의

    static int calcTotal(int x) { //매개변수 parameter
//        System.out.println("calcTotal 호출됨");

        int total = 0;
        for (int n = 1; n <= x; n++) {
            total += n;
        }
        return total;

    }//end calcTotal
    

    public static void main(String[] args) {
        //메서드호출
       int result = calcTotal(10);// 인수 argument
        System.out.println("result = " + result);
        calcTotal(50);
        int result2 = calcTotal(100);
        System.out.println("result2 = " + result2);

    }//end main

    //메서드 생성은 가능, 호출은 안됨

}//end class
