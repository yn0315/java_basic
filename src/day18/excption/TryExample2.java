package day18.excption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("정수1:");
            int n1 = sc.nextInt(); //warning

            System.out.print("정수2:");
            int n2 = sc.nextInt(); //warning

            int divResult = n1 / n2;
            System.out.println("divResult = " + divResult);
        } catch (InputMismatchException e) {
            System.out.println("정수로만 입력하세요!");
        }catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안됩니다.");
            //e.printStackTrace();//에러의 원인로그제공
        }catch (Exception e) {
            e.printStackTrace();
        }
        //catch 여러 개 사용 가능

        sc.close();
    }
}
