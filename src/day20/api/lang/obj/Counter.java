package day20.api.lang.obj;

public class Counter {

    private  int no;

    //생성자
    public Counter(int no) {
        this.no = no;
    }


    //소멸자: 객체가 메모리에서 제거될 때 자동호출
    @Override
    protected void finalize() throws Throwable {
        System.out.println(no + "번 객체 소멸됨!");
    }

    // C++소멸자
    // ~Counter(){}//물결 안붙이면 생성자

    //파이썬 생성자
    //def__init__(self):
    //파이썬 소멸자
    //def__del__(self):

    public static void main(String[] args) {

        System.out.println("소멸자 테스트");
        Counter c = null;
        for (int i = 0; i < 50; i++) {

            c = new Counter(i);
            c = null;
            System.gc();//가비지컬렉터를 빨리 호출


        }


    }
}
