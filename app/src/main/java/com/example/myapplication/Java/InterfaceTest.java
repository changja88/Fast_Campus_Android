package com.example.myapplication.Java;


public class InterfaceTest extends Person implements PlusInterface {

    @Override
    public int plus(int a, int b) {
        return 0;
    }

    @Override
    public void eat() {
        super.eat();
    }
}
