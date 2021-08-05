package day08;

import java.util.Scanner;

public class ScannerProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수:");
        int n = sc.nextInt();//\n이 남아있어 nextLine으로 전가해버림
        sc.nextLine();//\n을 미리 받아주고 없애주는 역할

        System.out.print("문자:");
        String str = sc.nextLine();
        System.out.println("str = " + str);

        System.out.println("입력종료!");
        sc.close();

    }
}
