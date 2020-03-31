package com.example.myapplication.Java;

public class Class {

    int number1;
    int number2;
    int number3;

    public Class(int a, int b) {
        // 리턴타입이 없는 함수가 -> 생성자 이다
        this.number1 = a;
        this.number2 = b;
    }

    public Class(int a, int b, int c) {
        this.number1 = a;
        this.number2 = b;
        this.number3 = c;
    }


    public static void main(String[] args) {
        Class a = new Class(1, 2);
        Class b = new Class(1, 2, 3);

        // init 블럭을 사용할 수 없다.
    }

}
