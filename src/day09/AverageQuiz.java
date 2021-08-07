package day09;

public class AverageQuiz {

    static double[] calcArrayTotal(int...numbers) {

        double total = 0;
        double[] arrTotAvg= new double[2];

        for (int n : numbers) {
            total += n;
            arrTotAvg[0] = total;
            arrTotAvg[1] = total/numbers.length;
        }
        return arrTotAvg;

    }



    public static void main(String[] args) {

    int[]numbers = {57, 89, 78, 91, 93, 47 };
    double[] arrTotAvg = calcArrayTotal(numbers);
        System.out.printf("총점: %d점, 평균: %.2f점\n", (int)arrTotAvg[0], arrTotAvg[1]);

    }//end main
}//end class
