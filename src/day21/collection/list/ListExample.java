package day21.collection.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * 어쩌고저쩌고
 * 아무말
 *
 * @version 1.0.0
 * @author 김철수
 * @description 얄리얄리
 * @param <E> 어쩌고다
 */

public class ListExample {

    public static void main(String[] args) {

        //리스트 : 순차형 자료구조, 데이터가 순서대로 저장
        //        , 중복저장허용, 인덱스 가짐

//        String[] sArr = new String[10];
        List<String> sList = new ArrayList<>();

        //add() : 리스트에 객체를 추가
        sList.add("멍멍이");
        sList.add("야옹이");
        sList.add("짹짹이");
        sList.add("두껍이");
        sList.add("개굴이");
        sList.add("야옹이");

        System.out.println(sList);

        //size() : 저장된 객체의 수 확인
        int size = sList.size();
        System.out.println("size = " + size);

        //add(index, object) : 중간 삽입
        sList.add(2, "어흥이");
        System.out.println(sList);

        //set(index, obj) : 객체 수정
        sList.set(3, "메롱이");
        System.out.println(sList);

        //remove(idx), remove(obj)
        sList.remove("개굴이");//같은 이름이 두 개 있으면 제일 먼저 발견된거 하나만 지움
        sList.remove(1);
        System.out.println(sList);

        //get(index) : 리스트에서 객체 참조
        String s = sList.get(2);
        System.out.println("s = " + s);

        //indexOf(obj) : 저장객체 인덱스 탐색
        int index = sList.indexOf("어흥이");
        System.out.println("index = " + index);

        //contains(obj) : 객체의 저장 유무 확인
        boolean b = sList.contains("귀뚜라미");
        System.out.println("b = " + b);

        //List의 반복문 처리
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }

        System.out.println("====================================");

        for (String str : sList) {
            System.out.println(str);
        }

        //clear() : 리스트 내부 객체 전체 삭제
        sList.clear();
        System.out.println(sList);
        System.out.println(sList.size());
        System.out.println(sList.isEmpty());

        //초기값을 가진 리스트
//        int[] iArr = {10, 20, 30};

        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(10, 20, 30, 5, 8, 56, 2)
        );

        System.out.println(numbers);

        //오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        //내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);


    }
}
