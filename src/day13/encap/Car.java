package day13.encap;

public class Car {

    //속도
    private int speed;//직접 접근해서 조작할 수 없게 프라이빗, 이러고 끝내면 참조도 안됨

    //변속 모드(D,N,R,P)
    private char mode;

    //시동 상태 체크 필드
    private boolean startFlag;

    //숨겨진 필드값을 설계자 의도대로 설정할 수 있게 하는 메서드 setter
    public void setMode(char mode) {
        if(!startFlag) {
            System.out.println("시동을 먼저 걸어주세요!");
            return;
        }
        switch (mode) {
            case 'D': case 'R': case 'N': case 'P':
                this.mode = mode;
                System.out.println("변속이 성공적으로 수행되었습니다.");
                break;
            default:
                System.out.println("잘못된 기어모드 설정입니다.");
                System.out.println("P모드로 자동 세팅합니다.");
                this.mode ='P';
        }
        //현재모드 출력
        showMode();
    }

    //현재 변속모드를 보여주는 메서드
    void showMode(){
        System.out.println("현재 기어모드: " + this.mode);
    }

    //속도를 참조할 수 있도록 해주는 메서드 getter//타입이 boolean이면 isSpeed라고 써야 함
    public int getSpeed() {
        return this.speed;
    }

    //감속기능
    public void slowdown() {
        if (this.speed <= 0) {
            this.speed = 0;
            System.out.println("더 이상 감속할 수 없습니다.");
            return;
        }
        this.speed -=50;
        System.out.printf("현재 속도는 %dkm/h 입니다.\n", this.speed);

    }

    //가속기능
    public void accelerator() {
        this.speed += 50;
        System.out.printf("현재 속도는 %dkm/h 입니다.\n", this.speed);
        if (this.speed >= 200) {
            System.out.println("과속은 위험합니다. 속도를 100으로 제한합니다.");
            this.speed = 100;
        }
    }


    //엔진 시동을 거는 기능
    public void engineStart() {
        startInjectionGasoline();//캡슐화//프라이빗처리하여 은닉, 밖에서 따로 호출 못하게 막음
        moveCylinder();//캡슐화
        System.out.println("시동이 걸립니다.");
        startFlag = true;
    }

    //연료가 분사되는 기능
    private void startInjectionGasoline() {
        System.out.println("연료가 엔진에 주입됩니다.");

    }

    //실린더가 작동하는 기능
    private void moveCylinder() {
        System.out.println("실린더가 움직입니다.");

    }

}
