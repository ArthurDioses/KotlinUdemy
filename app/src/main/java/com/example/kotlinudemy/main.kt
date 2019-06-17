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
/*fun main(args:Array<String>) {
    var epicString ="Hello World"

    println(epicString)
    println(epicString.length)

    println(epicString.get(7))
    println(epicString[7])

    println(epicString.compareTo("Hello  World"))

    var result = epicString.plus("Dioses")

    println(result)
}*/
/*fun main(args: Array<String>) {
    //Using Array
    var i = 8
    println(i)

    var scores = arrayOf(1, 3, 5, 78, 3)

    var name = arrayOf("Arthur", "Felipe", "Dioses", "Reto", "IronMan", "Thor")

    println(scores[2])
    println(name[3])

    println(scores.get(2))
    println(name.get(3))

    scores[1] = 4
    println(scores[1])

    scores.set(1, 580)

    println(scores[1])
}*/
/*fun main(args: Array<String>) {
    //Convertir variables

    var i = 9

    var x :Long = i.toLong()

    var epicString:String = x.toString()

    println(x)

    println(epicString)
}*/
/*fun main(args: Array<String>) {
    var num1 = 55
    var num2 = 23

    //------------------------
    //ARITHMETIC OPERATORS
    //Addition Operator
    println(num1 + num2)

    //Subtraction Operator
    println(num1 - num2)

    //Multiplication Operator
    println(num1 * num2)

    //Division Operator
    println(num1 / num2)
    println(num1.toFloat() / num2.toFloat())

    //Modulus Operator
    println(num1 % num2)

}*/
/*fun main(args: Array<String>) {
    var num1 = 55
    var num2 = 23
    //----------------------------------------
    //RELATIONAL OPERATORS

    //Equals To
    println(num1 == num2)

    //Not Equals To
    println(num1 != num2)

    //Greater Than
    println(num1 > num2)

    //Less Than
    println(num1 < num2)

    //Greater Than Or Equal To
    println(num1 >= num2)

    //Less Than Or Equal To
    println(num1 <= num2)
}*/
/*fun main(args: Array<String>) {
    //BASIC ASSIGNMENT OPERATOR
    var num1 = 55

    //ASSIGNMENT OPERATORS

    //Addition Assignment Operator
    num1 += 5 //num1 = num1 + 5
    println(num1)

    num1 = 55

    //Addition Assignment Operator
    num1 -= 5 //num1 = num1 - 5
    println(num1)

    num1 = 55

    //Multiplication Assignment Operator
    num1 *= 5 // num1 = num1 * 5
    println(num1)

    num1 = 55

    //Division Assignmetn Operator
    num1 /= 5 // num1 = num1 / 5
    println(num1)

    num1 = 57

    //Modulus Assignment Operator
    num1 %= 5 //num1 = num1 % 5
    println(num1)
}*/
/*fun main(args: Array<String>) {
    var num1 = 55
    //UNARY OPERATORS

    //Unary Plus
    println(+num1)

    //Unary Minus
    println(-num1)

    //Pre Increment
    println(++num1) //num1 = num1 + 1 or num1 += 1

    //Post Increment
    println(num1++) //num1 = num1 + 1 or num1 += 1
    println(num1)

    //Pre Decrement
    println(--num1) //num1 = num1 - 1 or num1 -= 1

    //Post Decrement
    println(num1--) //num1 = num1 - 1 or num1 -= 1
    println(num1)

    var epicValue = true

    println(!epicValue)


}*/
/* fun main(args: Array<String>) {
    //BITWISE OPERATORS

    //128  64 32 16 8 4 2 1
    // 0   1  0  1  0 1 0 0
    var x = 84

    //Shift Left
    //128  64 32 16 8 4 2 1
    // 1  0  1  0 1 0 0 0 0
    println(x.shl(1))

    //Shift Right
    //128  64 32 16 8 4 2 1
    // 0   0  1  0  1 0 1 0
    println(x.shr(1))

    var num1 = 78
    var num2 = 118

    //Bitwise AND
    //128  64 32 16 8 4 2 1
    // 0   1  0  0  1 1 1 0 -78
    // 0   1  1  1  0 1 1 0 -118
    // ----------------------------
    // 0   1  0  0  0 1 1 0 -70
    println(num1.and(num2))

    //Bitwise OR
    //128  64 32 16 8 4 2 1
    // 0   1  0  0  1 1 1 0 -78
    // 0   1  1  1  0 1 1 0 -118
    // ----------------------------
    // 0   1  1  1  1 1 1 0 -126
    println(num1.or(num2))

    //Bitwise XOR (exclusive or)
    //128  64 32 16 8 4 2 1
    // 0   1  0  0  1 1 1 0 -78
    // 0   1  1  1  0 1 1 0 -118
    // ----------------------------
    // 0   0  1  1  1 0 0 0 -56
    println(num1.xor(num2))

    //Bitwise Inverse
    //128  64 32 16 8 4 2 1
    // 0   1  0  0  1 1 1 0 -78
    // ----------------------------
    println(num1.inv())
} */
/*fun main(args: Array<String>) {

    var num1 = 50
    var num2 = 45

    //UNARY OPERATORS

    //AND (&&) Operator
    println(num1 > num2 && num1 != 55)

    //ORD (||) Operator
    println(num1 > num2 || num1 != 55)

    var variable = num1 > num2 || num1 != 55

    //NOT Operator
    println(!variable)

}*/
/*fun main(args: Array<String>) {
    print("World")
    print("Hello")
    println("Hello")
    println("Hello")

    //var data = readLine()
    var data :Int = Integer.valueOf(readLine())

    //println(data)
    println(data * 2)

}*/
/*fun main(args: Array<String>) {
    var num1 = 90


    if (num1 == 67) {
        println("It is equal to 67")
    } else if (num1 == 50) {
        println("It is equal to 50")
    } else if (num1 == 9) {
        println("It is equal to 9")
    } else {
        println("Default statement")
    }
    //------------------------

    var result = if (num1 == 67) {
        println("It is equal to 67")
        "67"
    } else if (num1 == 50) {
        println("It is equal to 50")
        "50"
    } else if (num1 == 9) {
        println("It is equal to 9")
        "9"
    } else {
        println("Default statement")
        "Default"
    }
    println(result)
}*/
/*fun main(args: Array<String>) {
    var x = 50

    when (x) {
        10, 20, 30 -> println("Epic")
        in 40..49 -> println("40 - 49")
        50 -> {
            println("50")
            println("Everything is awesome")
        }
    }
    //------------------------------------------
    var epicVar =
            when (x) {
                10, 20, 30 -> "10, 20 or 30"
                in 40..49 -> "40 - 49"
                50 -> {
                    println("50")
                    println("Everything is awesome")
                    "50"
                }
                else -> "Default"
            }
    println(epicVar)
}*/
/*fun main(args: Array<String>) {
    var epicArray = arrayOf(1, 2, 3, 4, 5, 6)

    //println(epicArray[0])
    //println(epicArray[1])
    //println(epicArray[2])
    //println(epicArray[3])
    //println(epicArray[4])
    //println(epicArray[5])
    for (item in epicArray) {
        println(item)
    }
    for (i in 1..15) {
        println(i * i)
    }
    for (i in 1..17 step 4) {
        println(i)
    }
}*/
/*fun main(args: Array<String>) {
    var x = 0
    while (x <= 100) {
        println(x * x)
        x++ //x+1 or x =x+1
    }

    //infinite loop
    while (true) {
        println("Never ending loop")
    }
}*/
/*fun main(args: Array<String>) {
    var x = 100
    println("While Loop")

    while (x <= 10) {
        println(x)
        x++ //x+=1 or x =x+1
    }

    println("Do While Loop ")
    x = 100
    do {
        println(x)
        x++ // x += 1 or x = x + 1
    } while (x <= 10)
}*/
/*fun main(args: Array<String>) {
    var i = 0

    loop@ while (i < 5) {
        var x = 0
        while (x < 10) {
            if (x == 4) {
                //break
                break@loop
            }
            println("i is $i and x is $x")
            x++
        }
        i++
    }

}*/
/*fun main(args: Array<String>) {
    var number = 100.0f
    var x = -10.0f
    while (x < 10.0f) {
        if (x == 0.0f) {
            x++
            continue
        }

        println(number / x)
        x++
    }
}*/
/*fun main(args: Array<String>) {
    EpicFunction()
    EpicFunction()
    EpicFunction()
}
fun EpicFunction(){
    println("Epic Hello")
}*/
/*fun main(args: Array<String>) {
    Addition(4, 5)
    Addition(5, 13)
    Addition(3534, 345664)
}
fun Addition(num1: Int, num2: Int) {

    println(num1 + num2)
}*/
/*fun main(args: Array<String>) {
    var number = Addition(4, 5)
    println(number)
    println(number * number)
}

fun Addition(num1: Int, num2: Int): Int {
    val result = num1 + num2

    return result
}*/
/*fun main(args: Array<String>) {
    CountUp(0, 10)
}

fun CountUp(startingNumber: Int, number: Int) {
    println(startingNumber)
    var nextNumber = startingNumber + 1
    if (startingNumber < number) {
        CountUp(nextNumber, number)
    }
}*/
/*fun main(args: Array<String>) {
    Add(5)
    Add()

    EpicFuntion('i', 65)
    EpicFuntion(number = 65)
}

fun Add(num1: Int = 1, num2: Int = 1) {
    println(num1 + num2)
}

fun EpicFuntion(letter: Char = 'a', number: Int = 9) {
    println("$letter and $number")
}*/
/*fun main(args: Array<String>) {
    val lambda: (Int) -> Unit = { s: Int-> println(s)}
    Multiply(4,5,lambda)
}

fun Multiply(num1: Int, num2: Int, lambda: (Int) -> Unit) {
    val result = num1 * num2
    lambda(result)
}*/
/*fun main(args: Array<String>) {
    var fn: (Int, Int) -> Int = { num1, num2 -> num1 * num2 }
    EpicFunction(5, 9, fn)
}

fun EpicFunction(num1: Int, num2: Int, fn: (Int, Int) -> Int): Unit {
    var result = fn(num1, num2)

    println(result)
}*/
/*fun main(args: Array<String>) {
    inlineFunc({
        println("Epic call")
    })
}

inline fun inlineFunc(myFunc: () -> Unit) {
    myFunc()
    println("Code inside this epic inline function")
}*/
/*fun main(args: Array<String>) {
    val num1 = 100
    val num2 = 20

    try {
        val result = num1 / num2
        println(result)
    } catch (error: ArithmeticException) {
        println(error)
    }
    println("After the check")


}*/
fun main(args: Array<String>) {
    var string = Convert("p")
    println(string)
}

fun Convert(strVar: String): Int {
    return try {
        Integer.parseInt(strVar)
    } catch (erro: NumberFormatException) {
        0
    }
}

