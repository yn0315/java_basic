package day18.excption;

public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = {"비둘기", "거북이", "이구아나"};

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i] + " 키울거야!");

            } catch (Exception e) {
                System.out.println("애완동물 정보가 없습니다.");
            }finally {//예외상황과 상관없이 실행해야 할 때//메모리 해제코드(DB나 네트워크 연결시, 하드디스크)쓸 때 사용
                System.out.println("애완동물 좋아요!");
            }
        }
        System.out.println("프로그램 정상종료!");

    }
}
