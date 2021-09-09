package day14.inherit.player;

public class Hunter extends Player{

    String beast;

    public Hunter() {
    }

    public Hunter(String nickName, int level, int hp, String beast) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.beast = beast;
    }

    @Override//오버라이딩 검사해주는
    public void info() {//상속받은 거 내부 고치는게 overriding
        // 시그니처는(이름, 리턴타입, 매개변수) 변경하면 안됨,
        // 접근제한자는 부모보다 public하게만 쓸 수 있음
        super.info();
        System.out.println("# 동물: " + beast);
    }

    public void thunderShot() {

    }

}
