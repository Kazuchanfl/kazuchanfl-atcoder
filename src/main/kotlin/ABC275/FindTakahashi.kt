package ABC275

fun main() {
    readLine()!!
    val hs = readLine()!!.split(" ").map(String::toInt)
    println(hs.indexOf(hs.max()) + 1)
}