package day06;

import java.util.Arrays;

public class ArrayPush {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 100, 200};
        int newData =40;

        //1. 원본배열보다 사이즈가 1개 더 큰 새 배열을 생성
        int[] temp = new int[arr.length +1];

        //2. 기존배열 데이터를 복사해서 신규배열로 이동
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }//end for

        //3. 추가할 데이터를 맨 마지막 위치에 저장
        temp[temp.length -1] = newData;

        //5. 주소값 이전
        arr = temp;
        temp = null;//주소끊어버려야 하니까


        System.out.println("기존배열:" + Arrays.toString(arr));
        System.out.println("신규배열:" + Arrays.toString(temp));

    }//end main
}//end class
