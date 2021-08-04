package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

    public static void main(String[] args) {


        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};


        Scanner sc = new Scanner(System.in);


        System.out.println("변경 전 정보:" + Arrays.toString(tvxq));


        while (true) {
            System.out.println("-삭제할 멤버의 이름을 입력하세요.");
            System.out.print(">");
            String member = sc.next();

            int idx = -1;
            for (int i = 0; i < tvxq.length; i++) {
                if (member.equals(tvxq[i])) {
                    idx = i;
                    break;
                }//end if
            }//end for


            //삭제여부결정
            if (idx != -1) {//삭제진행
                System.out.println(tvxq[idx] + "을 삭제합니다.");
                String[] temp = new String[tvxq.length - 1];

                for (int i =idx; i < tvxq.length-1; i++) {
                    tvxq[i] =tvxq[i + 1];
                }
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = tvxq[i];
                }

                tvxq = temp;
                temp = null;

                System.out.println(Arrays.toString(tvxq));
                break;
            } else {
                System.out.printf("%s는 없는 이름입니다.", member);

            }//end if
        }


    }
}

