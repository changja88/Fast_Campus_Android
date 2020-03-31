package com.example.myapplication.Java;

public class Variable {
    // 파일명과 클래스 이름이 동일해야한다
    // 끝에 ; 를 받듯이 붙여줘야 한다


    // 변수
    // var,val 가 없다

    int num = 10;
    String hello = "Hello";
    Double point = 3.4;


    public static void main(String[] args) {

//        variable : Variable =  Variable();

        Variable variable = new Variable();

        System.out.println(variable.num);
        System.out.println(variable.hello);
        System.out.println(variable.point);
    }

    // Java7 기준
    // 8-> Lambda 지원


}
