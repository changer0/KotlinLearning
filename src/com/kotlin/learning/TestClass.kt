package com.example.androidkotlindemo


class TestClass (var int: Int) {
    init {
        println("打印测试 => $int")
    }
}

fun main() {
    TestClass(123)
    val list = mutableListOf(1, 2, 3, 4, 5)

    list.forEach {
        println(it)
    }
}

