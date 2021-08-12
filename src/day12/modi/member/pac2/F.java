package day12.modi.member.pac2;

import day12.modi.member.pac1.D;

public class F {

    public F() {

        //메서드와 생성자 안에서 메서드 호출할 수 있음

        D d = new D();
//        d.f1;
//        d.f2 = 2;
        d.m1();
//        d.m2();
//        d.m3();


    }
}
