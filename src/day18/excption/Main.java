package day18.excption;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account(1000);

        try {
            acc.withDraw(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("잔액:" + acc.getBalance());
        System.out.println("프로그램 정상종료!");
    }
}
