package day17.abs;

public abstract class Car {

    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    //주행기능
    //추상메서드//추상메서드를 쓰려면 클래스도 abstract해야함
    public abstract void start();//추상클래스를 통해 자식클래스에게 오버라이딩을 강요

//    public abstract void engineBreak();

    public void seatHeater() {//쓰려면 고쳐써도 되고 안써도 되고
        System.out.println("시트 열선 기능을 가동합니다.");
    }

    public final void powerHandle() {//쓰려면 똑같이 쓰고 안쓰려면 쓰지말고
        System.out.println("파워핸들 기능!");
    }

}
