package com.kotlin.learning


data class User(var name: String)

//fun main() {
//    val user = User("Changer0")
//    val letResult = user.let { "let: ${it.name}" }
//    println(letResult)
//    val runResult = user.run {"let: ${this.name}" }
//    println(runResult)
//
//    user.also {
//        println("also:${it.name}")
//    }.apply {
//        println("apply:${this.name}")
//    }.name

//    user.takeIf { it.name.length > 0}?.also { println("name:${it.name}") } ?: println("name 为空")
//    user.takeUnless { it.name.length > 0}?.also { println("name:${it.name}") } ?: println("name 为空")
//
//    var with = with<User, User>(user) {
//        this.name = "Changer1007"
//        this
//    }
//    println(with.name)
//
//    with(user) {
//        this.name = "Changer1007"
//    }
//}



//fun main() {
//    for (i in 10 downTo 1) {
//        println(i)
//    }
//}

//fun main() {
//    val list: List<Int> = listOf(1, 2, 3, 4, 5)
//    list.convert { it + 1 }
//        .forEach {
//            print("$it ")
//        }
//
//    val a: String? = null
//    a?.run {
//        a.length
//        a.chars()
//        a.get(0)
//    }
//    a.length
//}
//
//
//

//fun main() {
//    val list: List<Int> = listOf(1, 2, 3, 4, 5)
//    list.convert { it + 1 }
//        .forEach {
//            print("$it ")
//        }
//}
inline fun <T, E> Iterable<T>.convert(action: (T) -> E): MutableList<E> {
    val list: MutableList<E> = mutableListOf()
    for (item in this) list.add(action(item))
    return list
}



//fun main() {
//    val a = arrayOf("4", "0", "7", "i", "f", "w", "0", "9")
//    val index = arrayOf(5, 3, 9, 4, 8, 3, 1, 9, 2, 1, 7)
//    index
//        .filter { it < a.size }
//        .map { a[it] }
//        .reduce{s, s1 -> "$s$s1" }
//        .also { println("密码是：$it") }
//}
//
//data class User(var age: Int, var name: String) {
//}



//sealed class SuperCommand {
//    object A : SuperCommand()
//    object B : SuperCommand()
//    class E(var id: Int): SuperCommand()
//}
//
//fun exec(command: SuperCommand) = when (command) {
//    SuperCommand.A -> {}
//    SuperCommand.B -> {}
//    is SuperCommand.E -> {}
//}
//
//
//
//
//enum class Command {
//    A, B, C, D
//}

//fun exec(command: Command) = when (command) {
//    Command.A -> { }
//    Command.B -> { }
//    Command.C -> { }
//    Command.D -> { }
//}
//
//

//class StringUtils {
//    companion object {
//        fun isEmpty(string: String): Boolean {
//            return "" == string
//        }
//    }
//}
//
//fun main() {
//    StringUtils.isEmpty("")
//}

//inline fun onlyIf(isDebug: Boolean, block: () -> Unit) {
//    if (isDebug) block()
//}
//
//fun main(): Unit {
//    onlyIf(true) {
//        println("Hello World")
//    }
//}


//
//fun main(): Unit {
//    val runnable = Runnable {
//        println("Runnable::run")
//    }
//    val function: () -> Unit
//    function = runnable::run
//    //注意这里传入的是 function，而不是function()
//    onlyIf(true, function)
//}


//val lambdaA = { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int,
//                i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int,
//                q: Int, r: Int, s: Int, t: Int, u: Int, v: Int, w: Int ->
//    println("hello world")
//}
//
//fun main() {
//    lambdaA(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
//}



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






