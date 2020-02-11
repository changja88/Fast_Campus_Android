package com.example.myapplication.Kotlin

// 27. Interface
// - 인터페이스는 약속 ! -> 니가 이것을 구현하면 너도 이 타입이다!
// - 생성자가 없다 -> 인스턴스화 시킬수 없다 -> 설명서가 아니다!
// - 지침서 -> 니가 이것을 구현하고 싶다면 받듯이 아래 기능을 구현해라!

// 상속이 만들어낸 특징
// - 자식 클래스는 부모 클래스의 타입이다
// - 부모 클래스는 자식 클래의 타입이 아니다!

// 상속과 다른점
// - 상속은 조상을 찾아가는 느낌
// - 인터페이스는 종의 특징

fun main(args: Array<String>) {
    val student_: Student_ = Student_()

    student_.eat()
    student_.sleep()

}

interface Person_ {
    fun eat()
    fun sleep()
}


class Student_ : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPlay : Person_ {
    override fun eat() {
    }

    override fun sleep() {
    }
}


open class Person() {
    open fun eat() {

    }

    fun sleep() {

    }
}


class Student() : Person() {

}

class Teacher() : Person() {

}
