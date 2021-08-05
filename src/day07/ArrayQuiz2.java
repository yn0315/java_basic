package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz2 {

    public static void main(String[] args) {
        //데이터 추가!
        Scanner sc = new Scanner(System.in);
        String[] menu = {"짜장면", "탕수육", "짬뽕", "우동"};

        System.out.println("기본메뉴:" + Arrays.toString(menu));
        int idx = -1;
        String plusData = "";

        while (true) {
            System.out.println("추가하고 싶은 위치의 데이터를 입력하세요.");
            System.out.print(">");
            String data = sc.next();


            //idx구하기

            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equals(data)) {
                    idx = i;
                    System.out.println(idx);
                }//end if
            }//end for


            //추가실행
            if (idx != -1) {
                System.out.println("추가하고 싶은 메뉴를 입력하세요");
                System.out.print(">");
                plusData = sc.next();

                //임시배열생성
                String[] temp = new String[menu.length + 1];

                //임시배열에 원본데이터 복사
                for (int i = 0; i < menu.length; i++) {
                    temp[i] = menu[i];

                }//end for

                //임시배열 데이터 오른쪽으로 옮기기
                for (int i = temp.length - 1; idx < i; i--) {
                    temp[i] = temp[i - 1];

                }//end for

                temp[idx] = plusData;
                menu = temp;
                temp = null;

            } else {
                System.out.println("다시 입력해주세요");
                sc.close();
                break;
            }//end if
            System.out.println(Arrays.toString(menu));

        }//end while

    }//end main
}//end class
