package day05;

public class LoopNesting {

    public static void main(String[] args) {
        //중첩반복문
        for (int i = 0; i < 3; i++) {
            System.out.println("outer" + i);
            for (int j = 0; j < 2; j++) {
                System.out.println("inner" + j);
                for (int k = 0; k < 4; k++) {
                    System.out.println("inner_" + k);

                }
                System.out.println("-------------------------");
            }//end inner for
            System.out.println("==========================");
        }//end outer for

    }//end main
}//end class
