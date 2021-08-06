package day09;

public class MothodQuiz1 {


    static int calcDivisor(int x) {
        int total = 0;
        System.out.print(x + "의 약수:");
        for (int n = 1; n <= x; n++) {
            if (x % n == 0) {
                System.out.printf("%d ", n);
                total += n;

            }//end if

        }//end for
        System.out.println();
                return total;
    }//end calcDivisor


    public static void main(String[] args) {

        System.out.println("10의 약수의 총합:" + calcDivisor(10));
        System.out.println("------------------------------------------");
        System.out.println("30의 약수의 총합" + calcDivisor(30));

    }
}
