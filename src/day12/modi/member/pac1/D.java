package day12.modi.member.pac1;

public class D {

    public int f1;
    int f2;
    private int f3;

    public void m1(){}
    void m2(){}
    private void m3(){}

    //생성자에도 접근제한 걸 수 있음
    public D() {//생성자에 프라이빗 걸면 다른데서 아예 못 씀
        f1 = 1; f2 = 2; f3 = 3;
        m1(); m2(); m3();

    }
}
