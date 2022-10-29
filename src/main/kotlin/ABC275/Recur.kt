package ABC275

fun main() {
    println(rec(readLine()!!.toInt()))
}

fun rec(n: Int): Int {
    if (n == 0) return 1
    return rec(n / 2) + rec(n / 3)
}