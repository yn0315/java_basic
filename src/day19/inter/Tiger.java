package day19.inter;

public class Tiger extends Animal implements Huntable, Violent{


    @Override
    public void hunt(String target) {
        System.out.println("호랑이는 앞발펀치로 사냥합니다.");
    }


    @Override
    public void attack() {

    }
}
