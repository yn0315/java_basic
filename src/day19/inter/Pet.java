package day19.inter;

public interface Pet {
    //쓸 수 있는 게 상수랑 추상메서드뿐, 껍데기임

    //상수
    int AAA = 10;

    //추상메서드
    void play();//인터페이스는 디폴트가 추상메서드라서 앞에 쓰는 public abstract 회색글씨로 뜸
    //인터페이스는 일반적인 필드도 못 만듦, 상수만 가능 static final도 회색으로 뜸

    default void eat() {
        //상속받는 클래스가 많을 경우 강요하게 되면 문제가 커지기 때문에 일시적으로 강제화를 막음
    };

}
