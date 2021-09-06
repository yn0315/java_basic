package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

    //===================필드 선언부=================//
    private Student[] sArr = new Student[5];

    //상수: 불변의 값 static final 붙임
    public static final int CUT_LINE = 60;

    //===================생성자 선언부=================//

    public StudentController() {
        sArr[0] = new Student("김길동","자바",100);
        sArr[1] = new Student("박길동","디비",50);
        sArr[2] = new Student("이길동","화면",85);
        sArr[3] = new Student("정길동","서버",60);
        sArr[4] = new Student("홍길동","자바",20);

    }

    //===================메서드 선언부=================//
    public Student[] printStudent() {
        return sArr;
    }

    public int sumScore() {

        int total = 0;

        for (Student student : sArr) {
            total += student.getScore();
        }
        return total;
    }

    public double[] avgScore() {
        double[] avgArr = new double[2];
        avgArr[0] = sumScore();
        avgArr[1] = avgArr[0] /sArr.length;
        return avgArr;
    }
}
