package day04;

import java.util.Arrays;
import java.util.Scanner;

public class whileQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수1:");
        int begin = sc.nextInt();
        System.out.println("정수2:");
        int end = sc.nextInt();
        int total = 0;

//        int n = begin;
//        while (n <= end) {
//            total += n;
//            n++;
//
//        }//while end
        //횟수가 정해져있으면 for를 써야 함

        for (int n = begin; n <= end; n++) {
            total += n;
        }//for end
        System.out.printf("%d ~ %d 까지의 총합: %d",begin, end, total);

        sc.close();
    }//main end
}//class end
