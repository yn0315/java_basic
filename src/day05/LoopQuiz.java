package day05;

import java.util.Scanner;

public class LoopQuiz {

    public static void main(String[] args) {

        /*
        1. 일단 1~20의 랜덤 숫자로 두 수의 덧셈문제를 1문제 출제한 후
           정답인지 오답인지 출력해보세요.
        2. 0을 입력할 때까지 반복해서 새로운 덧셈문제를 출제하고
           지속해서 정답 오답을 출력해보세요.
        3. 프로그램 종료되면 그동안의 정답횟수와
           오답횟수를 출력하세요.
        4. 빼기 기능을 추가하세요.
        5. 곱하기 기능을 추가하세요.
        6. 만약 두번째 숫자가 더 크다면 빼기 문제를 낼 때
           양수가 나올 수 있도록 앞숫자와 교체해주세요
           ex)  4 - 17 = ?    <- 이런문제가 출제될 경우
               17 - 4 = ?      <- 이렇게 바꿔서 출제할 것!
        7. 난이도 기능을 추가하세요 [상, 중, 하]
           - 상: 1~1000사이 정수로 문제출제
           - 중: 1 ~100 사이
           - 하: 1 ~ 10 사이
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("[문제를 푸시다가 지겨우면 0을 누르세요.]");


        System.out.println("'난이도를 입력하세요 [상,중,하]");
        System.out.print(">");
        String grade = sc.next();
        switch (grade) {
            case "상":
                System.out.println("상급난이도 입니다. 1~1000까지 범위로 출제됩니다.");
                break;
            case "중":
                System.out.println("중급난이도 입니다. 1~100까지 범위로 출제됩니다.");
                break;
            case "하":
                System.out.println("하급난이도 입니다. 1~10까지 범위로 출제됩니다.");
                break;
        }//end switch

        int correct = 0;
        int unCorrect = 0;
        while (true) {

            int num1 = (int) (Math.random() * 20) + 1;
            int num2 = (int) (Math.random() * 20) + 1;

            int total;

            int mark = (int) (Math.random() * 3);
            String arithmetic = mark == 0 ? "+" : mark == 1 ? "-" : "*";

            if (arithmetic == "+") {
                total = num1 + num2;
                System.out.printf("%d + %d = ?\n", num1, num2);
            } else if (arithmetic == "-") {
                total = num1 - num2;
                if (num1 < num2) {
                    System.out.printf("%d - %d = ? \n", num2, num1);
                } else {
                    System.out.printf("%d - %d = ?\n", num1, num2);
                }//end arithmetic inner if
            } else {
                total = num1 * num2;
                System.out.printf("%d * %d = ? \n", num1, num2);

            }//end arithmetic outer if

            System.out.print(">");
            int answer = sc.nextInt();
            if (answer == 0) {
                break;
            } else if (answer == total) {
                System.out.println("정답입니다.");
                correct++;
            } else {
                System.out.println("틀렸습니다.");
                unCorrect++;
            }//end answer if


        }//end while
        System.out.printf("정답횟수:%d회, 오답횟수:%d회\n", correct, unCorrect);
        sc.close();
        //컨트롤 알트 t 함수로 둘러싸는 단축키!
    }//end main
}//end class
