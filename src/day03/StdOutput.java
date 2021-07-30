package day03;

public class StdOutput {

    public static void main(String[] args) {

        String dog = "멍멍이";
        String cat = "야옹이";
        System.out.print(dog); //줄개행 지원 안됨
        System.out.println(cat);

        System.out.println(dog); // ln붙어있으면 자동 줄개행
        System.out.println(cat);

        String filePath = "D:\\temp\\new.jpg";
        System.out.println(filePath);

        String msg = "He said \"warning!\" to me"; //특수문자기호임을 알려주기 위해 따옴표 앞에 백슬래시
        System.out.println(msg);

        int month = 7;
        int day = 17;
        String anni = "제헌절";
        System.out.println(month + "월" + day + "일은" + anni + "입니다.");
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);//줄개행 지원 안됨, 꼭 써주기
        System.out.println("안녕");

        //%f는 소수점 6째자리까지 표현함.
        double saleRate = 0.2512;
        System.out.printf("오늘의 할인율은 %.2f%%입니다. \n", saleRate * 100);//%와 f 사이에 <.자리수> 작성
        //%를 특수기호로 처리하려면 두번써주기

    }
}
