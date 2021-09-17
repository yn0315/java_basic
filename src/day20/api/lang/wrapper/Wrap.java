package day20.api.lang.wrapper;

public class Wrap {

    static int x;
    static Integer y;//기본값 null, Integer가 객체가 돼서 null임

    public static void main(String[] args) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x= 5;
        y = 7;
        System.out.println(x + y);

        Object [] arr = {5, 8.8, "hello"};//wrapper로 인해 객체화돼서 object와 상속관계가 됨, 섞인 배열가능

        int n = 100;
        Integer m = n;

        //문자열 변환기능
        String s1 = "90";
        String s2 = "5.11";

        int i = Integer.parseInt(s1);
        double v = Double.parseDouble(s2);
        System.out.println(i + v);



    }
}
