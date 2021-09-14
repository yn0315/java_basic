package day16.poly.casting;

public class Child extends Patent{

    @Override
    public void m2() {
        System.out.println("자식의 오버라이딩된 2번 메서드!");
    }

    public void m3() {
        System.out.println("자식의 3번 메서드!");
    }

}
