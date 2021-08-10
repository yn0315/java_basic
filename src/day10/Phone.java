package day10;

//설계도 클래스는 main을 만들지 않습니다.
public class Phone {

    //속성: 객체의 데이터
    //필드(field) = 자바스크립트에서 프로퍼티
    String model; //모델명, 정의만 하고 값을 구체적으로 초기화하지 않음
    String color; //색상
    int price; //가격
    String[] receiveMessages; //받은 문자메시지들
    int messageCount; //총 문자메시지 수
    boolean isOn; //전원 켜진 여부

    //생성자(constructor)//클래스이름과 대소문자까지 같음
    //객체를 생성하고 초기화를 담당

    Phone() {//리턴개념이 없어 void가 기본값이라 아예 쓰지도 않음
        model = "갤럭시z-Fold2";
        color = "펄 블루";
        price = 3000000;
        isOn = true;

    }
    //생성자는 여러 개 선언할 수 있음(오버로딩)
    Phone(String modelName){
        model = modelName;
        color = "스노우 화이트";
        price = 1200000;
        isOn = true;
    }
    Phone(String modelName, String colorName){
        model = modelName;
        color = colorName;
        price = 1400000;
        isOn = true;
    }

    //기능: 객체의 행위
    //메서드(method): static은 붙이지 마세요.

    //전원 켜는 기능
    void powerOn() {
        isOn = true;
        System.out.println(model + "의 전원을 켭니다.");
    }

    //전원 끄는 기능
    void powerOff() {
        isOn = false;
        System.out.println(model + "의 전원을 끕니다.");
    }

    //핸드폰의 정보를 보여주는 기능
    void showSpec() {
        if (!isOn) {
            System.out.println("전원을 먼저 켜세요");
            return;
        }
        System.out.println("\n### 휴대폰 정보 ###");
        System.out.println("*모델명:" + model);
        System.out.println("*색상:" + color);
        System.out.println("*가격:" + price);
    }


}
