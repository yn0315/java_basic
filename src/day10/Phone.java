package day10;

//설계도 클래스는 main을 만들지 않습니다.
public class Phone {

    //속성: 객체의 데이터
    //필드(field) = 자바스크립트에서 프로퍼티
    //고유데이터
    String model; //모델명, 정의만 하고 값을 구체적으로 초기화하지 않음
    String color; //색상
    int price; //가격

    //상태데이터
    String[] receiveMessages = new String[3]; //받은 문자메시지들
    int messageCount; //총 문자메시지 수
    boolean isOn; //전원 켜진 여부

    //부품데이터(집합관계:composition)
    Battery battery;


    //생성자(constructor)//클래스이름과 대소문자까지 같음
    //객체를 생성하고 초기화를 담당

    //Phone() -> 기본생성자 default constructor
    Phone() {//리턴개념이 없어 void가 기본값이라 아예 쓰지도 않음
        model = "갤럭시z-Fold2";
        color = "펄 블루";
        price = 3000000;
        isOn = true;

    }
    //생성자는 여러 개 선언할 수 있음(오버로딩)
    //오버로딩 규칙: 매개변수의 타입이나 개수나 순서가 달라야 함
    //Phone(String)
    Phone(String modelName){
        model = modelName;
        color = "스노우 화이트";
        price = 1200000;
        isOn = true;
    }
    //위에 만들어서 Phone(String)은 못 만듦
    //Phone(String, String)
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

    //문자메시지를 보내는 기능
    boolean sendMessage(Phone targetPhone, String message) {
        if(!isOn) {
            System.out.printf("%s의 전원을 먼저 켜세요!\n", model);
            return false;
        }else if(!targetPhone.isOn) {
            System.out.printf("상대방 %s의 전원이 꺼져있습니다.\n", targetPhone.model);
            return false;
        }

        //메시지를 보낼 수 있는 경우
        if (targetPhone.messageCount < targetPhone.receiveMessages.length) {
            targetPhone.receiveMessages[targetPhone.messageCount++] = message;
            System.out.println("메시지가 성공적으로 전송됨");
            return true;
        } else {//상대방 메시지함이 다 찬 경우
            System.out.println("상대방의 메시지함이 가득 찼습니다.");
            return false;
        }
    }

    //수신메시지함을 확인하는 기능
    void checkMessages(){
        System.out.printf("\n===============[%s]의 메시지함 =================\n", model);
        for (int i = 0; i < messageCount; i++) {//receiveMessages.length로 하면 다 돌아서 안됨
            System.out.printf("# %d. %s\n", i+1, receiveMessages[i]);

        }
    }

    //배터리 교환기능
    void changeBattery(){
        //다른 객체를 생성해서 사용
        battery = new Battery("삼성");

    }

}
