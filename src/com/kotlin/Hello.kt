package com.kotlin

fun main(args: Array<String>){
	println("hello kotlin!!")
	println(add(1,9))
	println(sum(2,9))
	printSum(3,9)
	
	val a: Int = 1
	val b = 2
	val c: Int
	c = 3
	
	var x = 5
	x += 1
	println("a=$a,b=$b,c=$c,x=$x")
	
	println("maxOf:2,3:" + maxOf(2,3))
	println("maxOf0:2,3:" + maxOf0(2,3))
	println("parseInt:3:" + parseInt("3"));
}

fun add(a:Int, b:Int):Int{
	return a + b
}

fun sum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf0(a: Int, b: Int) = if (a > b) a else b

fun parseInt(str: String): Int? {
    return str.toInt()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("either '$arg1' or '$arg2' is not a number")
    }    
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

fun getStringLength0(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` is automatically cast to `String` in this branch
    return obj.length
}
fun getStringLength3(obj: Any): Int? {
    // `obj` is automatically cast to `String` on the right-hand side of `&&`
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}
//Using a for loop
fun loop(){
	val items = listOf("apple", "banana", "kiwi")
	for (item in items) {
	    println(item)
	}
}

fun loop2(){
	val items = listOf("apple", "banana", "kiwi")
	for (index in items.indices) {
	    println("item at $index is ${items[index]}")
	}
}

//Using a while loop
fun whileLoop(){
	val items = listOf("apple", "banana", "kiwi")
	var index = 0
	while (index < items.size) {
	    println("item at $index is ${items[index]}")
	    index++
	}
}
//
fun a(){
	fun describe(obj: Any): String =
	when (obj) {
	    1          -> "One"
	    "Hello"    -> "Greeting"
	    is Long    -> "Long"
	    !is String -> "Not a string"
	    else       -> "Unknown"
	}
}

fun rang(){
	val x = 10
	val y = 9
	if (x in 1..y+1) {
	    println("fits in range")
	}
}

fun numRang(){
	val list = listOf("a", "b", "c")

	if (-1 !in 0..list.lastIndex) {
	    println("-1 is out of range")
	}
	if (list.size !in list.indices) {
	    println("list size is out of valid list indices range too")
	}
	
	for (item in list) {
	    println(item)
		when {
		    "a" in list -> println("a")
		    "b" in list -> println("b")
		}
	}
	
	list
	.filter { it.startsWith("a") }
	.sortedBy { it }
	.map { it.toUpperCase() }
	.forEach { println(it) }
}

fun forNum(){
	for (x in 1..5) {
	    print(x)
	}
}

fun forStep(){
	for (x in 1..10 step 2) {
	    print(x)
	}
	for (x in 9 downTo 0 step 3) {
	    print(x)
	}
}




