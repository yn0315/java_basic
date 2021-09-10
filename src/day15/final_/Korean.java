package day15.final_;

public class Korean {

    String name;//이름
    //상수는 불변해야 하며 공유돼야함
    static final String NATION;//국적고정
    final String sid;//주민번호//처음에 생성된 번호로 고정돼 변경불가

    static {
        NATION = "대한민국";//static final 쓰고 이렇게 해야 상수가 됨
    }

    public Korean(String name, String sid) {
        this.name = name;
        this.sid = sid;

    }

    public static void main(String[] args) {

        Korean Park = new Korean("박","991111-1234567");

        Park.name = "박찬호";
//        Park.nation = "대한민국";

        Korean Kim = new Korean("김","111111-1111111");
        //생성할 때 국적 바꿀수 있으므로 final만 붙인다고 상수가 되는 게 아님



    }

}
