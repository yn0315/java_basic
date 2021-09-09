package day14.inherit.player;

//상위클래스로부터 상속받은 클래스를 자식, 하위클래스(sub class)
public class Warrior extends Player {//Player를 상속하는 문법

    int rage;

    public Warrior() {
        super();//이게 생략돼있음, 상속해야 해서 자동으로 불러 만듦, 부모의 기본생성자 호출...
        System.out.println("전사 객체 생성!");
    }

    public Warrior(String nickName, int level, int hp, int rage) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.rage = rage;
    }

    @Override
    public void info() {//상속받은 거 내부 고치는게 overriding//시그니처는 변경하면 안됨
        super.info();//부모(super)클래스의 인포호출, this.info()부르면 무한루프에 빠짐.... 안됨
        System.out.println("# 분노: " + rage);
    }

    public void fireSlash() {

    }



}
