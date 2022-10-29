package ABC275

//fun main() {
//    val key = 998244353
//    val inputs = readLine()!!.split(" ").map(String::toDouble)
//    val a = inputs[0] % key
//    val b = inputs[1] % key
//    val c = inputs[2] % key
//    val d = inputs[3] % key
//    val e = inputs[4] % key
//    val f = inputs[5] % key
//    println(floor((a * b * c) - (d * e * f)).toInt())
//}

fun main() {
    val key = 998244353
    val inputs = readLine()!!.split(" ").map(String::toDouble)
    val a = inputs[0]
    val b = inputs[1]
    val c = inputs[2]
    val d = inputs[3]
    val e = inputs[4]
    val f = inputs[5]
    val x = (a * b * c).toInt()
    val y = (d * e * f).toInt()
    println(((x % key - y % key) % key))
}