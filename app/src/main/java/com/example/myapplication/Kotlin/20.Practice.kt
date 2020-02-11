package com.example.myapplication.Kotlin


fun main(array: Array<String>) {
    val account: Account = Account("홍길동", "1990/3/1", 1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())

    println()
    val account2 = Account("홍길동", "1990/3/1", -2000)
    println(account2.checkBalance())

    println()
    val account3 = Account2("홍길동", "1990/3/1")
    val account4 = Account2("홍길동", "1990/3/1", 4000)
    println(account3.checkBalance())
    println(account4.checkBalance())


}
// 2) 은행 계좌 만들기
//    - 계좌 생성 기능 (이름, 생년 월일, 초기금액)
//    - 잔고를 확인 하는 기능
//    - 출금 기능
//    - 예금 기능

class Account {

    val name: String
    val birth: String
    var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if (balance >= 0) this.balance = balance else this.balance = 0
    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance = balance - amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account2(val name: String, val birth: String, var balance: Int = 1000) {

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance = balance - amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account3(initialBalance: Int) {

    val balance: Int = if (initialBalance >= 0) initialBalance else 0

    fun checkBalance(): Int {
        return balance
    }

}