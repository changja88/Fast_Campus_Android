package com.example.myapplication.Java;

public class Function {

    public int plus(int first, int second) {
        return first + second;
    }

//    public int plusFive(int first, int second=5){
//        return first+second
//    } -> 불가능


    public void printPlus(int first, int second) {
        int result = first + second;
    }// void를 생략할수 없다

//    public void plusShort(int first, int second) =first+second
    // -> 불가능

    public int plusMany(int... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }


    public static void main(String[] args) {
        Function function = new Function();
        int a = function.plusMany(1, 2, 3, 4, 5);
        System.out.println(a);
    }

}
