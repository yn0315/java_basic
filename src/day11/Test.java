package day11;
//다른 패키지에 있는 클래스를 불러올 때 패키지명을 생략할 수 있게 해줌
//패키지명은 전부 소문자로 쓰고 띄어쓰기는 _로 작성

//import는 패키지와 클래스 사이에 작성
//import day11.fruit.Banana;
//import day11.fruit.Mango;

//한번에 import 하는 방법
import day11.fruit.*;
import day11.company.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //day11.fruit.Banana b = new day11.fruit.Banana();
        Banana b = new Banana();//import로 인해 생략됨
        Mango mango = new Mango();
        day11.company.Apple apple = new day11.company.Apple();
        day11.fruit.Apple apple2 = new day11.fruit.Apple();


        Scanner sc = new Scanner(System.in);


    }
}
