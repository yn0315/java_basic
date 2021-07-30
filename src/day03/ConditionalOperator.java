package day03;

import java.util.Scanner;

public class ConditionalOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("너 얼마있어?");
        int money = sc.nextInt();
        String food = money >= 5000 ? "육개장" : "라면";
        System.out.println("food = " + food);

        sc.close();
    }
}
