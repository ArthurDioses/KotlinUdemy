package com.example.kotlinudemy


/*
fun main(args: Array<String>) {
    println("Hello fucking World")

    var epicVar = "Dioses"
    var num1 = 5
    val num2 = 67

    println(epicVar)
    println(num1)
    println(num2)

    epicVar = "IronMan"
    num1 = 100
    //num2 = 99

    println(epicVar)
    println(num1)
    println(num2)
}*/
fun main(args:Array<String>) {
    var epicString ="Hello World"

    println(epicString)
    println(epicString.length)

    println(epicString.get(7))
    println(epicString[7])

    println(epicString.compareTo("Hello  World"))

    var result = epicString.plus("Dioses")

    println(result)
}