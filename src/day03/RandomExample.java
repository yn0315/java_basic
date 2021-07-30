package day03;

public class RandomExample {

    public static void main(String[] args) {

        //Math.random(): 0.0이상 1.0 미만의 실수 난수 생성
        double rn = Math.random();
        System.out.println("랜덤값:" + rn);

        // 랜덤 정수 생성방법
        // 1 이상 10 이하의 랜덤 정수 생성
        // Math.random()   -> 0.0 이상 1.0미만
        // Math.random() * 10 -> 0.0 이상 10.0 미만
        // (int)(Math.random() * 10) -> 0 이상 10 미만
        // (int)(Math.random() * 10) +1 -> 1 이상 11 미만

        //공식 x이상 y 이하의 랜덤정수
        //(int)(Math.random() * (y-x+1)) +x

        int ri = (int) (Math.random() * 10) +1;// alt enter키!!
        System.out.println("랜덤정수: " + ri);
    }
}
