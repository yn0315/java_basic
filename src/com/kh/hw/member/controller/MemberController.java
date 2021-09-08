package com.kh.hw.member.controller;


import com.kh.hw.member.model.vo.Member;

import java.util.Arrays;

public class MemberController {


    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;


    public MemberController() {

        m[0] = new Member("abc", "김철수", "123", "abc@gmail.com", 'm', 22);
        m[1] = new Member("def", "박영희", "123", "def@gmail.com", 'f', 22);
        m[2] = new Member("hij", "김철수", "123", "fff@gmail.com", 'm', 22);
    }

    //메서드
    //실제 저장된 회원의 숫자를 반환
    public int existMemberNum() {
        int count = 0; //숫자를 세는 변수
        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) {
                break;
            }
            count++;
        }
        return count;

    }

    //아이디 중복체크하는 메서드
    public boolean checkId(String inputId) {
        for (Member member : m) {
            if (member == null) break;
            if (inputId.equals(member.getId())) {
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
        for (int i = 0; i < existMemberNum(); i++) {
            if (id.equals(m[i].getId())) {
                return m[i];
            }
        }
        return null;
        //for (Member member : m) {
//            if(id.equals(member.getId())) {
//                return member;//해당
//            }
//        }return null;//해당없음//못 찾았다...

    }

    //이름을 입력하면 그 아이디에 해당하는 회원들의 정보 리턴
    public Member[] searchName(String name) {
        //이름이 일치하는 회원들을 저장할 배열
        Member[] foundMembers = {};
        for (int i = 0; i < existMemberNum(); i++) {
            if (name.equals(m[i].getName())) {
                foundMembers = pushMember(foundMembers, m[i]);

            }
        }
        return foundMembers;
    }

    //멤버 배열에 데이터를 추가하는 메서드
    private Member[] pushMember(Member[] targets, Member newMember) {
        //배열 늘려서 갱신하는 작업
        //1. 원본배열보다 사이즈가 1개 더 큰 새 배열을 생성
        Member[] temp = new Member[targets.length + 1];

        //2. 기존배열 데이터를 복사해서 신규배열로 이동
        for (int i = 0; i < targets.length; i++) {
            temp[i] = targets[i];
        }//end for

        //3. 추가할 데이터를 맨 마지막 위치에 저장
        temp[temp.length - 1] = newMember;

        return temp;//리턴해서 서치네임으로 돌아가 남은 부분 실행
    }

    //이메일을 입력하면 그 아이디에 해당하는 회원1명의 정보 리턴
    public Member searchEmail(String email) {
        for (Member member : m) {
            if (email.equals(member.getEmail())) {
                return member;//해당
            }

        }
        return null;//해당없음
    }

    public boolean updatePassword(String id, String password) {
        Member member = searchId(id);
        if (member != null) {
            member.setPassword(password);
            return true;
        } else {
            return false;
        }
//        for (Member member : m) {
//            if(id.equals(member.getId())) {
//                member.setPassword(password);
//                return true;
//            }
//        }
//        return false;
    }


    public boolean updateName(String id, String name) {
        for (Member member : m) {
            if (id.equals(member.getId())) {
                member.setName(name);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String id, String email) {
        for (Member member : m) {
            if (id.equals(member.getId())) {
                member.setEmail(email);
                return true;
            }
        }
        return false;
    }

    public boolean delete(String id) {
        //앞으로 땡기고 마지막을 널로 변경
        int delIdx = -1;
        Member[] deleteMembers = new Member[10];

        //삭제인덱스찾기
        for (int i = 0; i < existMemberNum(); i++) {
            if (id.equals(m[i].getId())) {
                deleteMembers = copyData(deleteMembers, m[i]);
            }
        }

//        for (Member member : m) {
//            if(id.equals(member.getId())) {
//
//                return true;
//            }
//        }
        return false;
    }

    //회원정보 삭제를 위해 데이터를 복사하는 메서드

    private Member[] copyData(Member[] target, Member delMember) {
        //배열의 중간데이터 삭제
        Member[] temp = new Member[10];

        //인덱스 번호
        int delIdx = -1;


        for (int i = delIdx; i < m.length - 1; i++) {
            m[i] = m[i + 1];
        }

        Member[] copyTemp = new Member[m.length - 1];
        for (int i = 0; i < copyTemp.length; i++) {
            copyTemp[i] = m[i];
        }
        m = copyTemp;
        copyTemp = null;

        return m;

    }

    //회원정보를 전체 삭제하는 메서드
    public void delete() {
        for (int i = 0; i < m.length; i++) {
            m[i] = null;
        }
//        insertMember(null,null,null,null,null,0);

    }

    public Member[] printAll() {
        return m;
    }


}
