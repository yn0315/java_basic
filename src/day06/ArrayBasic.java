package day06;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        //1. 배열 변수 선언
        int[] points;

        //2. 배열 객체 생성
        points = new int[5];
        System.out.println("points = " + points);

        //3. 배열값 초기화
        points[0] = 87;
        points[1] = 95;
        points[2] = points[0] + 4;
        points[3] = (int) 33.154;//.154 는 안 들어감 33만 저장
        points[4] = 100;
//        points[5] = 55;//배열 인덱스 범위초과 (runtime exception) 기본화면에서는 안 알려주고 실행시킬 때 에러뜨는 거
//
        //4. 배열의 길이 확인
        System.out.println("배열의 총 요소 수:" + points.length);

        //5. 배열의 반복문 처리
        System.out.println("========================================");

        for (int i = 0; i < points.length; i++) {
            System.out.print(points[i] + " ");
        }//end for

        //enhanced for : 향상된 for문
        System.out.println("\n=================향상된 for================================");
        for (int n : points) {
            System.out.print(n + " ");
        }//end enhanced for

        //points배열의 숫자 총합
        int total = 0;

        //단축키 iter
        for (int n : points) {
            total += n;
        }//end enhanced for // for에 커서 놓고 alt enter쓰면 변환
        System.out.println("총합:" + total);

        //값 목록으로 배열 생성

        //배열의 선언과 생성을 동시에 할 수 있음
        double[] dArr = new double[4];

        //배열의 선언과 생성과 초기화를 동시에 할 수 있음
        String[] foods = new String[]{"짜장면", "탕수육", "볶음밥"};

        //배열의 선언시에만 new String[]생략가능
        String[] fruits = {"사과", "딸기", "바나나", "포도"};

        //배열 내부 값 문자열로 보기
        System.out.println(Arrays.toString(foods));
        System.out.println(Arrays.toString(fruits));

        System.out.println("==============================================");
        //배열을 생성만하고 초기화하지 않은 경우 각 타입의 기본값 저장
        boolean[] bArr = new boolean[5];
        System.out.println(Arrays.toString(bArr));

        //배열 복사
        System.out.println("==============배열 복사======================");
        int[] iArr = new int[]{1, 3, 5, 7, 9, 11};
//        int[] copyArr = iArr;//값복사가 아니라 주소값복사가 되어 관리자가 둘이 되는 것과 같음
//
//        copyArr[2] = 100;
//        iArr[3] = -50;

        //배열의 복사 알고리즘
        //1. 원본배열과 크기가 같은 배열하나를 더 생성함
        int[] copyArr = new int[iArr.length];

        //2. 원본배열의 값들을 복사배열로 값 복사
        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = iArr[i];
        }//end for
        copyArr[2] = 100;

        System.out.println("iArr:" + Arrays.toString(iArr));
        System.out.println("copyArr:" + Arrays.toString(copyArr));

    }//end main
}//end class
