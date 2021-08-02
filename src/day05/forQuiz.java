package day05;

import java.util.Arrays;

public class forQuiz {

    public static void main(String[] args) {

        int ri = (int) (Math.random() * 8) + 2;
        System.out.printf("랜덤구구단 %d단\n", ri);

        for (int i = 1; i <= 9; i++) {
            int total = ri * i;
            System.out.printf("%d * %d = %d\n", ri, i, total);
        }//end for

    }//end main
}//end class
