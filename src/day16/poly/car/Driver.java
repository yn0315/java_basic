package day16.poly.car;

public class Driver {

    //int x = 100; test(x); => int a = x;
    public void test(int a) {
        System.out.println("a= "+ a);

    }

    //drive(new Sonata()); => Car c = new Sonata();
    public void drive(Car c) {
        System.out.println("운전을 시작합니다.");
        c.run();
    }

//    public void drive(Tucson t) {
//        System.out.println("운전을 시작합니다.");
//        t.run();
//    }

    public Car buyCar(String carName) {

        if(carName.equals("투싼")) {
            System.out.println("투싼을 구매합니다.");
            return new Tucson();
        }else if(carName.equals("소나타")){
            System.out.println("소나타를 구매합니다.");
            return new Sonata();
        }else if(carName.equals("박스터")) {
            System.out.println("박스터를 구매합니다.");
            return new Boxster();
        }else {
            System.out.println("그런 차량은 없습니다.");
            return null;
        }
    }


}
