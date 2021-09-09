package day14.protected_.pac2;

import day14.protected_.pac1.A;

public class D extends A {
    public D() {
//        super(5);//디폴트라 안됨
        super("23454");
//        super.f1 =1;디폴트
        super.f2 = 2;//프로텍티드는 상속을 통해 부를 수 있음
//        super.m1();
        super.m2();
    }

}
