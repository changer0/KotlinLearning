package com.kotlin.learning


val lambdaA = { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int,
                i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int,
                q: Int, r: Int, s: Int, t: Int, u: Int, v: Int, w: Int ->
    println("hello world")
}

fun main() {
    lambdaA(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
}



//val lambda1 = { a: Int ->
//    println("hello world")
//}
//fun main() {
//    lambda1(1)
//}






//val echo = { name: String ->
//    println(name)
//}




//open class Animal
//class Dog: Animal()
//
//fun Animal.name() = "animal"
//fun Dog.name() = "dog"
//
//fun Animal.printName(animal: Animal) {
//    println(animal.name())
//}

//fun function() {
//    val str = "hello"
//    fun say(count: Int = 10) {
//        println(str)
//        if (count > 0) {
//            say(count - 1)
//        }
//    }
//    say()
//}





//fun testFun(str: String) = println(str)



//fun print(name: String = "Default Name") {
//    println(name)
//}



//fun function(str: String) {
//    val fmt1 = format(str)
//    fmt1.length
//    //val fmt2: String = format(str)
//    val fmt3: String? = format(str)
//}



//fun testClass(clazz: KClass<KotlinMain>) {
//    println(clazz.simpleName)
//}



//
//fun testClass(clazz: Class<JavaMain>) {
//    println(clazz.simpleName)
//}
//
//
//
//
//
//var name2: String? = null
//
//var age = 18
//
//
//var name = "lulu"


//fun printLen(str: String) : String {
//    println("这是一个字符串：$str")
//    return str
//}

//
//object Test {
//    @JvmStatic
//    fun sayMessage(str: String) {
//        println(str)
//    }
//}






