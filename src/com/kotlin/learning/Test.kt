package com.kotlin.learning

fun main() {
    JavaMain.`in`
}



//fun testClass(clazz: KClass<KotlinMain>) {
//    println(clazz.simpleName)
//}




fun testClass(clazz: Class<JavaMain>) {
    println(clazz.simpleName)
}





var name2: String? = null

var age = 18


var name = "lulu"


//fun printLen(str: String) : String {
//    println("这是一个字符串：$str")
//    return str
//}


object Test {
    fun sayMessage(str: String) {
        println(str)
    }
}






