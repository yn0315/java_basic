package day08;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        //정보처리기사 문제...
        //다차원 배열



        //2차원 배열
        int[][] arr2d = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(" arr2d " +arr2d.length );
        System.out.println(Arrays.toString(arr2d[0]));
        System.out.println(arr2d[2][1]);
        arr2d[1][2] = 100;

                 //new int[]생략불가
        arr2d[2] = new int[]{10,20,30};
        System.out.println(arr2d);

        System.out.println("================================");

        for ( int[] arr :arr2d ) {
            for ( int n : arr) {
                System.out.print(n + " ");
            }//end inner for
            System.out.println();//단순 줄개행
        }//end for
        System.out.println("======================================");
        //배열생성문으로 생성하기
        //3행 5열짜리 배열
        int[][] testArr = new int[3][5];

        for (int[] ints : testArr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }//end inner for
        System.out.println();
        }//end outer for


        //3차원 배열
        //int[][][]
        int [][][] arr3d = {
            {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            },
            {
                {10,11,12},
                {13,14,15},
                {16,17,18}
            },
            {
                {19,20,21},
                {22,23,24},
                {25,26,27}
            }
        };

        System.out.println("3차원배열");
        System.out.println(arr3d[2][0][1]);
        System.out.println("==========================================");

        int[][][] arr3dTest = new int[2][4][3];
        //iter엔터 3번
        for (int[][] ints : arr3dTest) {
            for (int[] anInt : ints) {
                for (int i : anInt) {

                }//end inner for
            }//end middle for
        }//end outer for

    }//end main
}//end class
