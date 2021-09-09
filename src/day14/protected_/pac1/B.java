package day14.protected_.pac1;

public class B {

    public B() {
        new A(5);
       A a = new A("ggg");

       a.f1 = 1; a.f2 = 2;
       a.m1(); a.m2();
    }
}
