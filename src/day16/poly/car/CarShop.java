package day16.poly.car;

public class CarShop {

    public int sellCar(Car car) {//넘어올 때 어떤 타입인지 알 수 없어
        if (car instanceof Sonata) {//이 car가 sonata의 인스턴스인지 궁금하다//맞으면 true를 리턴함
            return 1300;
        } else if (car instanceof Tucson) {
            return 2000;
        }else if (car instanceof Boxster) {
            return 7800;
        }else {
            return 0;}
    }
}