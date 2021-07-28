package day02;

public class Casting2 {

    public static void main(String[] args) {

        char c = 'B';
        int i = 2;
        System.out.println(c + i);

        System.out.println(10 + 3.5);//int인 10이 자동 형변환되어 double로 됨

        char result1 = (char) (c + i);
        System.out.println("result1 = " + result1);
        
        double result2 = 3.5F + 5.6;
        //크기가 다른 데이터끼리의 연산은 크기가 작은 쪽이 큰쪽으로 자동 형변환 된 후 연산됨.
        
        //int보다 작은 (byte, short, char) 의 연산은 결과값이 자동으로 int로 형변환 됨 
        byte b1 = 100, b2 = 10;
        
//        byte b3= b1 + b2; 안됨
        
        int b3 = b1 + b2; 
        
        int n1 = 27, n2 = 5;

//        double result3 =  n1/ n2;
        double result3 = (double) n1/ n2;//n2까지 double로 바꾸지 않아도 int 에서 자동형변환

        System.out.println("result3 = " + result3);
        
    }
}
