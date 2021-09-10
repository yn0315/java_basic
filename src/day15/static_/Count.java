package day15.static_;

public class Count {

    public int x;//인스턴스필드
    public static int y;//스태틱 필드//메모리 한 개로 공유됨

    public void m1() {//인스턴스 메서드
        int z = this.x + this.y;//this는 m1을 호출하는 것의
//        m2(this);
    }
    public static void m2(Count c) {//스태틱 메서드
        //스태틱 메서드에서는 인스턴스 멤버를 직접 사용 불가능
        //this라는 개념이 없음
        //int z = x + y;
//        c.m1();//위에처럼 그냥 호출을 못해서 앞에 c를 꼭 써줘야 함
        int z = c.x + y;//메인에서 호출한 c3의 x를 씀

    }


}
