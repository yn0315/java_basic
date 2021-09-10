package day15.static_;

public class Calculator {

    String madeBy;//제조사
    String color;//색상
    static double pi;//원주율 고정시켜야되니까

    //정적 초기화자(static initializer)
    //static 필드의 생성자 역할 (객체초기화담당)
    static {
        System.out.println("정적 초기화자 호출!");//자동으로 호출됨//메인에서 생성자 안 만들어도 자동호출
        pi = 3.14159265;

    }

    public Calculator() {
    }

    public Calculator(String madeBy, String color) {
        this.madeBy = madeBy;
        this.color = color;
        pi = 3.14159265;
    }

    //메서드 안에서 인스턴스 필드를 사용해야 하면
    //non-static으로 만들고, static필드만 사용하면
    //static으로 만들면 됨.

    //계산기에 색칠하는 기능
    void paint(String color){
        this.color = color;

    }

    //원의 넓이를 구하는 기능
    static double calcAreaCircle(int r) {
        return pi*r*r;

    }



}
