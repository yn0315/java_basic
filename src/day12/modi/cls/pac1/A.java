package day12.modi.cls.pac1;

import day12.modi.cls.pac2.C;

//접근제한자 자리에 아무것도 안쓰면 default제한이 걸립니다.
//클래스에는 public, default제한만 사용할 수 있습니다.
class A {
    public int f1;
    public int f2;

    public void m1(){
        B b = new B();// B: public

//        new C();//알트엔터 클래스 가져오기-> 임폴트//C: public

    }

}
