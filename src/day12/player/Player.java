package day12.player;

public class Player {

    String name;
    int level;
    int hp;

//    public Player() {
//        System.out.println("1번 생성자 호출!");
//        this.name = "이름없음";
//        this.level = 1;
//        this.hp = 50;
//
//    }

    public Player() {
        this("이름없음", 1);
        System.out.println("1번 생성자 호출!");

    }

//    public Player(String name) {//알트 인서트 생성자 네임 클릭하면 자동완성
//        System.out.println("2번 생성자 호출!");
//        this.name = name;//필드의 네임을 구분해주기 위해 this작성해줌
//        this.level = 1;
//        this.hp = 50;
//
//    }

    public Player(String name) {//알트 인서트 생성자 네임 클릭하면 자동완성
        this(name,1);//반드시 첫번째 줄에 써야 함//3번 생성자를 호출해오는거임
        System.out.println("2번 생성자 호출!");
    }


    public Player(String name, int level) {//알트인서트 컨트롤 누르고 네임레벨 같이 찍어서 선택
        System.out.println("3번 생성자 호출!");
        this.name = name;
        this.level = level;
        this.hp = 50;
    }

    void attack(Player this, Player target) {//자바에는 Player this라는 매개변수가 하나 숨어있음 생략가능

        System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);


    }

    void info() {
        System.out.printf("이름: %s 레벨: %d, 체력: %d\n", this.name, this.level, this.hp);

    }


}
