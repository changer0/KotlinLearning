package com.kotlin.learning

fun main() {
    val testInter = TestInterImpl()
    val testInterProxy = TestInterProxy(testInter)
    testInterProxy.method("代理调用")
}

class TestInterProxy(testInter: TestInter): TestInter by testInter

interface TestInter {
    fun method(string: String)
}

class TestInterImpl: TestInter {
    override fun method(string: String) {
        println("method: $string")
    }
}






