package com.kotlin.learning
import com.kotlin.learning.A.format

fun main() {

}

fun function(str: String) {
    val fmt1 = format(str)
    fmt1.length
    //val fmt2: String = format(str)
    val fmt3: String? = format(str)
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
    @JvmStatic
    fun sayMessage(str: String) {
        println(str)
    }
}






