package day10;
//실행용 클래스(객체를 생성해서 사용하는 곳)에 main을 만듭니다.
public class PhoneFactory {

    public static void main(String[] args) {
        
        //객체의 생성 //타입이 클래스 이름이 됨!!!!
        Phone galaxyS21 = new Phone();
        System.out.println("galaxyS21 = " + galaxyS21);

        //객체의 속성과 기능 참조: 참조연산자 . 을 사용
//
//        galaxyS21.model = "갤럭시S21";
//        galaxyS21.color = "크롬블랙";
//        galaxyS21.price = 1000000;
//
//        galaxyS21.powerOn();

        galaxyS21.showSpec();//showSpec은 단독호출 안됨, 핸드폰만 호출됨!!
        //ctrl누르고 단어 누르면 해당 파일로 이동

        System.out.println("=================================================");

//        Phone iPhoneX = new Phone();
//        iPhoneX.model = "아이폰x";
//        iPhoneX.color = "스노우 화이트";
//        iPhoneX.price = 1200000;
//
//        iPhoneX.powerOn();
//        iPhoneX.showSpec();

        Phone iPhonex = new Phone("아이폰x");

        iPhonex.showSpec();

        System.out.println("=====================================================");

        Phone lgv6 = new Phone("LG V6", "에메랄드 그린");
        lgv6.showSpec();

        System.out.println("===============================================");

        iPhonex.battery = new Battery("샤오미");//기본생성자 생성, 배터리클래스에서 하나도 선언하지 않았을 경우
        // 배터리클래스에 자동으로 만들어줌

        System.out.println("아이폰x 배터리:"+ iPhonex.battery.company);


        System.out.println("==============================================");

        //()안에 컨트롤 피

        galaxyS21.sendMessage(iPhonex, "에베베베베");
        galaxyS21.sendMessage(iPhonex, "메롱메롱");

        iPhonex.sendMessage(galaxyS21, "즐");
        galaxyS21.checkMessages();

        iPhonex.sendMessage(lgv6, "아이폰이 비싸다");
        lgv6.checkMessages();




    }
}
