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


    }
}
