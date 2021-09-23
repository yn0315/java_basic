package day21.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MapExample {

    public static void main(String[] args) {
        //Map : key, value의 쌍으로 데이터를 관리
        //      key는 중복저장 불가능, value는 가능
        Map<String, Student> students = new HashMap<>();

        //put(k,v) : 맵에 데이터 추가
        students.put("멍멍이",new Student("김철수", 15));
        students.put("냥냥이",new Student("또치", 9));
        students.put("짹짹이",new Student("도우너", 12));
        System.out.println(students);

        //중복된 key를 put하면 value가 수정된다.
        students.put("냥냥이",new Student("고길동", 44));
        System.out.println(students);

        //get(key) : map에 저장된 객체 참조
        Student s = students.get("멍멍이");//리턴타입 student value를 가져오니까......
        System.out.println("s = " + s);
        int age = students.get("냥냥이").age;

        //containsKey(k) : map에 저장된 key 존재 유무 확인
        System.out.println(students.containsKey("깍깍이"));
        System.out.println(students.containsKey("짹짹이"));

        //map의 반복문 처리//iterable을 인터페이스로 두지 않아서 못 씀
        Set<String> keys = students.keySet();
        System.out.println(keys);

        System.out.println("===========================================");
        for (String key : keys) {
            System.out.println(students.get(key));
        }

        System.out.println("===========================================");
        //remove(key) : 특정 데이터셋(entry) 삭제
        students.remove("냥냥이");
        System.out.println(students.size());
        System.out.println(students);

        students.clear();
        System.out.println(students.isEmpty());
    }
}
