package day02;

public class BitOperater {

    public static void main(String[] args) {

        //비트연산
        byte a = 5; // 00000101
        byte b = 3; // 00000011

        //비트곱: 각 자리수를 곱하세요.
        System.out.println(a & b);// 00000001 -> 10진수변환하여 1

        //비트합: 각 자ㅣ수를 더하세요. 단 1 + 1은 1로 처리하세요.
        System.out.println(a | b); //00000111 -> 7

        //배타적 논리합: 다르면 1 같으면 0
        System.out.println(a ^ b); // 00000110 -> 6

        //비트 이동 연산
        //왼쪽방향: 2의 이동숫자 제곱만큼 곱함
        //오른쪽방향 : 2의 이동숫자 제곱만큼 나눔
        int x = 192; //00000000 00000000 00000000 11000000
        System.out.println(x << 3);//3자리를 올린 값을 곱하라 2의 3승.. 8을 곱하라
        System.out.println(x >> 2);//2자리를 내려라 2 의 -2승 //4를 나눠라

        //비트반전(단항연산자)
        int y = 8;// 00001000
        System.out.println(~y);


    }
}
