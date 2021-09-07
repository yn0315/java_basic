package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;

import java.util.Scanner;

public class MemberMenu {

    private Scanner sc = new Scanner(System.in);
    private MemberController mc = new MemberController();

    //메서드
    public MemberMenu() {


    }

    public void mainMenu() {
        while (true) {

            System.out.printf("최대 등록 가능한 회원 수는 %d명입니다.\n", mc.SIZE);
            //현재 등록 회원수 //ctrl alt v 변수추출
            int count = mc.existMemberNum();
            System.out.printf("현재 등록된 회원 수는 %d명입니다.\n", count);

            System.out.println();

            if (count < mc.SIZE) {
                System.out.println("\n1. 새 회원 등록");
            }
            System.out.println("2. 회원 검색");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 모두 출력");
            System.out.println("9. 끝내기\n");
            System.out.print("#메뉴 번호: ");

            int menuNo = sc.nextInt();

            switch (menuNo) {
                case 1:
                    insertMember();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);//프로그램 종료
                    break;
                default:
                    System.out.println("메뉴를 잘못 입력했습니다.");
            }

        }

    }

    public void insertMember() {
        System.out.println("\n# 회원가입을 시작합니다.");

        String id;
        while (true) {
            System.out.print("# 아이디: ");
            id = sc.next();
            if (mc.checkId(id)) {
                break;
            } else {
                System.out.println("아이디가 중복되었습니다. 다시 입력하세요.");
            }

        }
        System.out.print("# 이름: ");
        String name = sc.next();

        System.out.print("# 비밀번호: ");
        String pw = sc.next();

        System.out.print("# 이메일: ");
        String email = sc.next();

        String gender;
        while (true) {
            System.out.print("# 성별: ");
            gender = sc.next();
            //대소문자 무시하고 비교하는 방법//equalsIgnoreCase
            if (gender.equalsIgnoreCase("m") || gender.equals("f")) {
                break;
            } else {
                System.out.println("성별은 m 또는 f로만 입력하세요.");
            }
        }

        System.out.print("# 나이: ");
        int age = sc.nextInt();
        mc.insertMember(id, name, pw, email, gender, age);


    }

    public void searchMember() {

    }

    public void searchId() {

    }

    public void searchName() {

    }

    public void searchEmail() {

    }

    public void updateMember() {

    }

    public void updatePassword() {

    }

    public void updateName() {

    }

    public void updateEmail() {

    }

    public void deleteMember() {

    }

    public void deleteOne() {

    }

    public void deleteAll() {

    }

    public void printAll() {

    }


}
