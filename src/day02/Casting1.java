package day02;

public class Casting1 {
    public static void main(String[] args) {

        //묵시적 형변환(promotion, upcasting)
        byte a = 100;
        int b = a;//a가 b로 들어가면서 byte타입에서 int로 승격됨

        double c = b; //b가 int타입에서 double로 승격됨
        System.out.println("c = " + c);
        
        //명시적 형변환 (downcasting)
        int n = 1000;
        byte m = (byte) n;//n을 byte로 강제변환
        System.out.println("m = " + m);
        
        double d = 500.1234;
        int i = (int) d;//double이었던 d를 int로 강제변환
        System.out.println("i = " + i);

        char r = 'A';
        int o = r;
        short p = (byte) o;//낮은 단계로 강제변환 시켜도
        System.out.println("p = " + p);
    }
}
