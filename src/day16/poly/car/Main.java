package day16.poly.car;

public class Main {
    public static void main(String[] args) {

        Car t = new Tucson();
        Car s = new Sonata();
        Car b = new Boxster();

        Car[] sArr = {s, t, b, new Sonata(), new Boxster()};

        for (Car car : sArr) {
            car.run();
        }

//        Rich richMan = new Rich();
//        richMan.myCars = new tuscon[30];
//        richMan.myCars[0] = t;

        System.out.println("=======================================");
        Driver park = new Driver();
        park.drive(new Boxster());

        System.out.println("======================================");
        Sonata mySonata = (Sonata)park.buyCar("소나타");//소나타타입(하위타입)으로 캐스팅해서 리턴받음
        mySonata.run();
        mySonata.joinClub();
        sArr[0] = mySonata;//업캐스팅안해도 알아서 변환돼 car로 들어감

        System.out.println("=================================");
        CarShop carShop = new CarShop();
        carShop.sellCar(mySonata);
        int money = carShop.sellCar(b);
        System.out.println("money = " + money + "만원");


    }
}
