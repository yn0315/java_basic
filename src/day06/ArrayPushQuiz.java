package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {

    public static void main(String[] args) {

        //문자열끼리의 동등비교시 == 을 사용하지 말고
        //문자열1.equals(문자열2)을 사용할 것!
        //ex) if (s1 ==s2) (x)
        //    if (s1.equals(s2)) (o)

        Scanner sc = new Scanner(System.in);
//
        System.out.println("# 먹고싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요");

//        String[] menu = new String[0];
        String[] menu = {};

        while (true) {
            //음식명을 입력받고
            System.out.print(">");
            String select = sc.nextLine();
            if (select.equals("그만")) break;

            //공간을 확보 -> 사이즈가 기존배열보다 1개 큰 배열 생성
            String[] temp = new String[menu.length + 1];
            //기존의 음식들을 임시배열로 이동
            for (int i = 0; i < menu.length; i++) {
                temp[i] = menu[i];
            }//end for

            //새로운음식을 사이즈 큰 임시배열의 마지막 인덱스에 추가
            temp[temp.length - 1] = select;
            //원본배열로 임시배열의 주소를 이동
            menu = temp;
            temp = null;
            System.out.println(Arrays.toString(menu));

        }//end while
    }//end main
}//end class
