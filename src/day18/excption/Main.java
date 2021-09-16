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

        // new FileOutputStream("D:/temp");세이브파일 만드는 메서드//파일이 없을 가능성이 있으므로 try catch로 감싸줘야함
        //file.mkdir();//파일 만드는 메서드

    }
}
