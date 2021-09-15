package day18.excption;

class Test {

    int number;

    public Test(int number) throws Exception {//실행순서1
        this.number = aaa(number);//실행순서5
    }

    public int aaa(int n) throws Exception {//실행순서4
        return bbb(n) / n;
    }

    private int bbb(int n) throws Exception {//실행순서3
        return ccc(n) / n;
    }

    private int ccc(int n) throws Exception {//실행순서 2
        return 100 / n;
    }
}


public class ThrowsExample {

    public static void main(String[] args) {

        Test test = null;//예외처리 메인까지 던지면 안됨
        try {
            test = new Test(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(test.number);
    }
}
