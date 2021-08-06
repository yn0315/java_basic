package day09;

public class Parameter {

    //랜덤으로 음식명 하나를 리턴하는 메서드
    static String chooseRandomFood() {
       String[] foods = {"짬뽕", "볶음밥", "치킨", "삼겹살", "파스타"};
        return foods[(int)(Math.random() * foods.length)];
        //ctrl alt n 리팩터링 한번만 사용하고 끝나니까 코드 줄이기 위해

    }

    //전달받은 2개의 정수의 합을 구해서 리턴하는 메서드

    static int addTwo(int n1,int n2){
        return n1 + n2;
    }
    
    //전달받은 n개의 정수의 합을 구해 리턴하는 메서드
    static int calcNumbersTotal(int[] numbers){
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total; 
    }

    //자바스크립트의 스프레드 문법과 동일..
    //1차원배열할 때만 사용하기
    static int calcNumbersTotal2(int... numbers){
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }


    public static void main(String[] args) {

        String randomFood = chooseRandomFood();
        System.out.println("randomFood = " + randomFood);

        System.out.println(addTwo(20,30));

        int[] nums = {10,20,30}; 
        int total = calcNumbersTotal(nums);
        System.out.println("total = " + total);

        int total2 = calcNumbersTotal(new int[]{10, 20, 30, 40});//alt enter쳐보기
        System.out.println("total2 = " + total2);

        calcNumbersTotal2(5,4,3,2,1,10,20);
        calcNumbersTotal2(nums);


    }//end main
}//end class
