package day20.api.lang.obj;

public class Main extends Object{

    public static void main(String[] args) {

        Member member = new Member("김철수", 30, "탄방동");
        System.out.println(member.toString());//뒤에 toString이 생략된 것

    }


}
