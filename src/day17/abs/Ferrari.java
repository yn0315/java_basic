package day17.abs;

public class Ferrari extends Car{

    public Ferrari(String model, int price) {
        super(model, price);
    }

    public void start(){//반드시 만들어야 하는 기능
        System.out.println("페라리가 달립니다.");
    }
}
