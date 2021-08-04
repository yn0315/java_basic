package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {

    public static void main(String[] args) {


        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        int idx = -1;

        Scanner sc = new Scanner(System.in);


        System.out.println("변경 전 정보:" + Arrays.toString(tvxq));


        while (true) {
        System.out.println("-수정할 멤버의 이름을 입력하세요.");
            System.out.print(">");
            String member = sc.next();

            for (int i = 0; i < tvxq.length; i++) {
                if (member.equals(tvxq[i])) {
                    idx = i;
                    break;
                }//end if
            }//end for
            //수정여부결정
            if (idx != -1) {//수정진행
                System.out.println(tvxq[idx]+"의 별명을 변경합니다.");
                System.out.print(">");
                String trade = sc.next();
                tvxq[idx] = trade;
                System.out.println(Arrays.toString(tvxq));
                break;
            } else {
                System.out.printf("%s는 없는 이름입니다.", member);

            }//end if
        }


    }

    //end while


}

