package com.example.myapplication.Java;

public class Array {


    public static void main(String[] args) {

        int[] a;
        String[] b;

        int[] c = new int[5];
        int[] d = {1, 2, 3, 4, 5};

        // 타입이 섞여있는 배열은 만들 수 없다

        int e = d[2];
        // get으로 배열의 값을 찾을 수 없다.

        d[3] = 10;
        // set으로 배열의 값을 할당 할 수 없다.




    }
}
