package day16.poly.overLoading;

public class Basic {

    //add(int, int) 같은 형태 못 만듬
    int add(int n1, int n2) {
        System.out.println("2개짜리 실행");
        return n1+n2;
    }
    //이름 중복으로 해도되는 게 오버로딩
    //add(int,int,int)
    int add(int n1, int n2, int n3) {
        System.out.println("3개짜리 실행");
        return n1+n2+n3;
    }
//    add(int,String)
    int add(int x, String y) {
        return 0;
    }

    //리턴타입은 안봄 add(int,String)
//    void add(int m,String n) {
//
//    }

    //add(String,int)
    void add(String m ,int n){

    }

    //add()
    void add(){}


    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.add(3,5);
//        basic.addThree(3,5,9);
        basic.add(1,2,3);

        System.out.println();

    }

}
