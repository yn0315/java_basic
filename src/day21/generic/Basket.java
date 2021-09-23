package day21.generic;

public class Basket<F extends Fruit> {//F(fruits) generic타입 (복제타입)//섞어 담기는 싫은데 각각 종류의 과일을 담고는 싶은

    private F f;

    public void setF(F f) {
        this.f = f;
    }

    public F getF() {
        return f;
    }

}
