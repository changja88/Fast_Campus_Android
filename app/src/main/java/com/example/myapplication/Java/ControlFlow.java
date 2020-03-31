package com.example.myapplication.Java;

public class ControlFlow {


    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        if (a > b) {
            System.out.println("a가 b보다 크다");
        } else {
            System.out.println("a가 b보다 작다");
        }

//        int c = if(a>b){
//            a
//        }else {
//            b
//        } -> 값을 리턴하는 if 불가능


        //when 구문 사용 불가능다
        switch (a) {
            case 1: {

            }
            case 2: {

            }
        }//int 만 가능하다
    }

}
