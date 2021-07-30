package day03;
import java.util.Arrays;
import java.util.Scanner;
public class ScannerQuiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("-상품의 가격: ");
        int pay = sc.nextInt();

        System.out.print("-상품의 수량: ");
        int num = sc.nextInt();

        System.out.println("=========================================");
        int totalPrice = pay*num;
        System.out.printf("상품 재고 총액 : %d원", totalPrice);

        sc.close();
    }
}
