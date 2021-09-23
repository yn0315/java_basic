package day21.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        //Set : 중복저장 허용 x, 순서없이 빠르게 저장, 전체탐색속도 빠름

        Set<String> set = new HashSet<>();
        //add(obj) : set에 객체 추가
        set.add("김말이");
        set.add("닭강정");
        set.add("단무지");
        set.add("김밥");
        set.add("김말이");

        System.out.println("Size: "+ set.size());
        System.out.println(set);

        //set 컬렉션은 개별탐색 안됨, 탐색용도로 쓰지 말것

        //set 반복문 처리
        System.out.println("===================================");
        for (String s : set) {
            System.out.println(s);
        }

        String msg = "hello";
//        for ( char c : msg) {// String이 iterable을 구현하지 않아서 못 씀
//
//        }

        //remove(obj) : set의 객체 삭제
        set.remove("단무지");
        System.out.println(set);
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
