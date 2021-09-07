package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

import java.util.Arrays;
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
                    searchMember();
                    break;
                case 3:
                    updateMember();
                    break;
                case 4:
                    deleteMember();
                    break;
                case 5:
                    printAll();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);//프로그램 종료
                    break;
                default:
                    System.out.println("메뉴를 잘못 입력했습니다.");
            }//end switch

        }//end while

    }//end mainMenu

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
            }//end if

        }//end while
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
        }//end while

        System.out.print("# 나이: ");
        int age = sc.nextInt();
        mc.insertMember(id, name, pw, email, gender, age);


    }//end insertMember

    public void searchMember() {

        while (true){
            System.out.println("1. 아이디로 검색하기");
            System.out.println("2. 이름으로 검색하기");
            System.out.println("3. 이메일로 검색하기");
            System.out.println("9. 메인으로 돌아가기");
            int menuNo = sc.nextInt();

            switch (menuNo) {
                case 1:
                    searchId();
                    break;
                case 2:
                    searchName();
                    break;
                case 3:
                    searchEmail();
                    break;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    mainMenu();
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    mainMenu();
            }
            break;
        }


    }

    public void searchId() {
        System.out.println("아이디를 입력해주세요.");
        String id = sc.next();
        Member searchMember = mc.searchId(id);
        System.out.println("일치하는 회원의 정보내역입니다.");
        System.out.println(searchMember.inform());
        if(searchMember == null) {
            System.out.println("일치하는 정보를 찾지 못했습니다.");
        }

    }

    public void searchName() {
        System.out.println("이름을 입력해주세요.");
        String name = sc.next();
        Member[] searchMember = mc.searchName(name);
        System.out.println("일치하는 회원의 정보내역입니다.");
        for (int i = 0; i < searchMember.length; i++) {
            System.out.println(searchMember[i].inform());
        }

        if(searchMember == null) {
            System.out.println("일치하는 정보를 찾지 못했습니다.");
        }

    }

    public void searchEmail() {
        System.out.println("이메일을 입력해주세요.");
        String email = sc.next();
        Member searchMember = mc.searchEmail(email);
        System.out.println("일치하는 회원의 정보내역입니다.");
        System.out.println(searchMember.inform());
        if(searchMember == null) {
            System.out.println("일치하는 정보를 찾지 못했습니다.");
        }

    }

    public void updateMember() {
        while (true) {
            System.out.println("1. 비밀번호 수정하기");
            System.out.println("2. 이름 수정하기");
            System.out.println("3. 이메일 수정하기");
            System.out.println("9. 메인으로 돌아가기");
            int menuNo = sc.nextInt();

            switch (menuNo) {
                case 1:
                    updatePassword();
                    break;
                case 2:
                    updateName();
                    break;
                case 3:
                    updateEmail();
                    break;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    mainMenu();
                    break;
            }

        }

    }

    public void updatePassword() {
        System.out.println("아이디와 비밀번호를 입력해주세요.");
        System.out.print("아이디: ");
        String id = sc.next();
        System.out.print("비밀번호: ");
        String password = sc.next();
        if(!mc.updatePassword(id, password)){
            System.out.println("존재하지 않는 회원입니다.");
            mainMenu();
        };
        if(mc.updatePassword(id, password)){
            System.out.println("수정이 완료되었습니다.");
            mainMenu();
        };

    }

    public void updateName() {
        System.out.println("아이디와 이름을 입력해주세요.");
        System.out.print("아이디: ");
        String id = sc.next();
        System.out.print("이름: ");
        String name = sc.next();
        if(!mc.updateName(id, name)){
            System.out.println("존재하지 않는 회원입니다.");
            mainMenu();
        };
        if(mc.updateName(id, name)){
            System.out.println("수정이 완료되었습니다.");
            mainMenu();
        };

    }

    public void updateEmail() {
        System.out.println("아이디와 이메일을 입력해주세요.");
        System.out.print("아이디: ");
        String id = sc.next();
        System.out.print("이메일: ");
        String email = sc.next();
        if(!mc.updateEmail(id, email)){
            System.out.println("존재하지 않는 회원입니다.");
            mainMenu();
        };
        if(mc.updateEmail(id, email)){
            System.out.println("수정이 완료되었습니다.");
            mainMenu();
        };

    }

    public void deleteMember() {
        System.out.println("1. 특정 회원 삭제하기");
        System.out.println("2. 모든 회원 삭제하기");
        System.out.println("9. 메인으로 돌아가기");
        int menuNo = sc.nextInt();

        switch (menuNo) {
            case 1:
                deleteOne();
                break;
            case 2:
                deleteAll();
                break;
        }

    }

    public void deleteOne() {
        System.out.println("삭제할 아이디를 입력해주세요.");
        String id = sc.next();
        System.out.println("정말로 삭제하시겠습니까? Y/N");
        String delAnswer = sc.next();

        if(delAnswer.equalsIgnoreCase("y")) {
            mc.delete(id);
        }
        if(!mc.delete(id)){
            System.out.println("존재하지 않는 회원입니다.");
            mainMenu();
        };
        if(mc.delete(id)){
            System.out.println("삭제가 완료되었습니다.");
            mainMenu();
        };


    }

    public void deleteAll() {
        System.out.println("정말로 삭제하시겠습니까? Y/N");
        String delAnswer = sc.next();
        if(delAnswer.equalsIgnoreCase("y")) {
                mc.delete();
                System.out.println("삭제가 완료되었습니다.");

        }

    }

    public void printAll() {
        mc.printAll();


    }


}
