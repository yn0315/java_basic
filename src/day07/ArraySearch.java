package day07;

import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        String[] foods = {"치킨", "피자", "삼겹살", "족발", "파스타", "짜장면"};

        //순차 탐색 알고리즘
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 음식명:");
        String target = sc.next();
        sc.close();

        //찾은 인덱스를 저장할 변수
//        int idx = 0;
//        for (int i = 0; i < foods.length; i++) {
//            if (foods[i].equals(target)) {
//                idx = i;
//                break;
//            }//end if
//
//
//        }//end for
        //없는 거 찾기
//        int idx = -1;
//        for (int i = 0; i < foods.length; i++) {
//            if (foods[i].equals(target)) {
//                idx = i;
//                break;
//            }//end if
//
//
//
//        }//end for

        //탐색하는 데이터의 유무를 저장할 변수
        boolean include = false;
        int idx = -1;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(target)) {
                idx = i;
                include = true;
                break;
            }//end if



        }//end for
        System.out.println("탐색인덱스:" + idx);
        System.out.println("탐색성공?:" + include);
    }//end main
}//end class
