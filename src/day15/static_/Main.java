package day15.static_;

public class Main {

    public static void main(String[] args) {
        Count c1 = new Count();
        c1.x = 5;
        Count.y = 10;

        Count c2 = new Count();
        c2.x++;
        Count.y++;

        System.out.println("c1.x = " + c1.x);
        System.out.println("c2.x = " + c2.x);
        System.out.println("===============");
        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);

        Count c3 = new Count();
        Count.y +=40;//스태틱 필드 쓸 때는 클래스 이름으로 씀
        System.out.println("c3.y = " + c3.y);

        Math.random();//스태틱.. new Math 안 쓰고 바로 씀
        c1.m1();
        c2.m1();

        Count.m2(c3);
//        Calculator sharpCal = new Calculator("샤프","파랑");//객체생성
//        sharpCal.paint("빨강");//어떤계산기인지 알려줘야함
        double result = Calculator.calcAreaCircle(5);//아무계산기나 들고와서 계산하면 됨//초기화 안해서 0나옴
        System.out.println(result);


    }
}
