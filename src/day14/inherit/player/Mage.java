package day14.inherit.player;

public class Mage extends Player {

    int mana;

    //기본생성자와 전체생성자, setter/getter는 기본적으로 그냥 만들어둬야함


    public Mage() {

    }

    public Mage(String nickName, int level, int hp, int mana) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.mana = mana;
    }

    @Override
    public void info() {//상속받은 거 내부 고치는게 overriding//시그니처는 변경하면 안됨
        super.info();
        System.out.println("# 마력: " + mana);
    }


    public void meteor() {

    }

}
