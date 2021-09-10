package day15.final_;

class Child extends Parent{//안에다 클래스 만들 수 있는데 퍼블릭은 못 붙임
    @Override
    void m2() {}
}

//public final class Parent {//마지막 클래스니까 상속하지 말고 바꾸지도 말고 그대로 써라
public class Parent {

    String s;

    final void m1(){}//상속해서 사용하지 마라.(overriding금지)
    void m2(){}

}
