package day03;

//1. 2,입력을 받기위한 것
// 1. 스캐너 api를 불러오기

import java.util.Scanner;

public class StdInput {

    public static void main(String[] args) {

        // 2. 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 3. 스캐너가 제공하는 함수들로 입력을 처리
        // next(), nextLine(): 문자열 입력처리,  next()는 공백입력 불가!
        // nextInt(), nextDouble(): 각각 정수, 실수 입력처리
        System.out.println("# 정보를 입력하세요.");

        System.out.print("- 이름:");
        String name = sc.next();//입력커서를 만들고 입력된 데이터를 리턴

        System.out.print("- 나이:");
        int age = sc.nextInt();// nextInt 사이에 컨트롤 알트 브이 누르면 자동으로 변수생성
        System.out.println("==============================================");
        System.out.printf("입력된 이름은 %s이고, 나이는 %d세 입니다.", name, age);

        // 4. 스캐너 자원 메모리 해제
        sc.close();// 다 쓴 후에 꼭 작성, 이후에 3번 함수들 작성하면 적용안됨

    }
}
