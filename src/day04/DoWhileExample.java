package day04;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int n = 0;

        //while은 시작조건이 false면 0회 실행된다.
       /* while (n != 0) {
            System.out.println("정수 (0입력시 종료) :");
            n = sc.nextInt();
            total +=n;
        }*/
        //do~while은 시작조건이 false여도 최초1회 실행을 보장함
        do {
            System.out.println("정수 (0입력시 종료) :");
            n = sc.nextInt();
            total += n;
        } while (n != 0);
        System.out.println("입력 누적값:" + total);
        sc.close();
    }
}
