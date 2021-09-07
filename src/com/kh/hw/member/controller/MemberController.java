package com.kh.hw.member.controller;


import com.kh.hw.member.model.vo.Member;

public class MemberController {


    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;



    //메서드
    //실제 저장된 회원의 숫자를 반환
    public int existMemberNum() {
        int count = 0; //숫자를 세는 변수
        for (int i = 0; i < m.length; i++) {
            if(m[i] == null) {
                break;
            }
            count++;
        }
        return count;

    }

    //아이디 중복체크하는 메서드
    public boolean checkId(String inputId) {
        for (Member member : m) {
            if(member == null) break;
            if(inputId.equals(member.getId())) {
                return false;//중복됨
            }
        }
        return true;//중복 안됨
    }

    public void insertMember(String id, String name, String password,
                             String email, String gender, int age) {
        //chatAt(index) : 문자열에서 해당 위치의 글자 하나를 추출
        //m[existMemberNum()] = new Member(id, name, password,email,gender.charAt(0),age);//
        int count = existMemberNum();
        m[count] = new Member(id, name, password, email, gender.charAt(0), age);

    }
    //아이디 입력하면 그 아이디에 해당하는 회원1명의 정보 리턴
    public Member searchId(String id) {
        for (Member member : m) {
            if(id.equals(member.getId())) {
                return member;//해당
            }
        }return null;//해당없음

    }

    //이름을 입력하면 그 아이디에 해당하는 회원들의 정보 리턴
    public Member[] searchName(String name) {
        Member[] memNoArr = new Member[0];
//        int memNo = 0;
        for (int i = 0; i < m.length; i++) {
            if (name.equals(m[i])) {
//                memNo = i;
                break;
            }
        }
        return memNoArr;
    }
    //이메일을 입력하면 그 아이디에 해당하는 회원1명의 정보 리턴
    public Member searchEmail(String email) {
        for (Member member : m) {
            if(email.equals(member.getEmail())) {
                return member;//해당
            }

        }return null;//해당없음
    }

    public boolean updatePassword(String id, String password) {
        for (Member member : m) {
            if(id.equals(member.getId())) {
                member.setPassword(password);
                return true;
            }
        }
        return false;
    }


    public boolean updateName(String id, String name) {
        for (Member member : m) {
            if(id.equals(member.getId())) {
                member.setName(name);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String id, String email) {
        for (Member member : m) {
            if(id.equals(member.getId())) {
                member.setEmail(email);
                return true;
            }
        }
        return false;
    }

    public boolean delete(String id) {
        for (Member member : m) {
            if(id.equals(member.getId())) {

                return true;
            }
        }
        return false;
    }

    public void delete() {
//        insertMember(null,null,null,null,null,0);

    }

    public Member[] printAll() {

        return null;
    }


}
