package day16.poly.casting;

public class Main {

    public static void main(String[] args) {

        Patent patent = new Patent();
        patent.m1();
        patent.m2();
//        patent.m3();
        System.out.println("=============================");
        Child child = new Child();
        child.m1();
        child.m2();
        child.m3();

        System.out.println("==================================");

        Patent c = new Child();//부모의 가면만 씀, 실제 데이터는 child
        System.out.println(c);
        c.m2();
        ((Child)c).m3();//upcasting하면 본인의 메서드를 못써서 일시적으로 내려줌



    }
}
