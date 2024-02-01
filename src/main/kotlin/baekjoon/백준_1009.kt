package org.example.baekjoon


fun main(args: Array<String>) {
    val n = readln().toInt()

    for (i in 1..n) {
        var (a, b) = readln().split(" ").map { it.toInt() }
        var result = a
        for (j in 1..< b)  {
            result = (result * a) % 10
        }

        if (result % 10 == 0) {
            println(10)
        } else {
            println(result % 10)
        }
    }
}