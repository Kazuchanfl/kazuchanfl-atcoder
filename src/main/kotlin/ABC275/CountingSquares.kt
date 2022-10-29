package ABC275

fun main() {
    // 座標情報の入力を二次元配列に格納
    val sList = mutableListOf<MutableList<Char>>()
    repeat(9) {
        sList.add(readLine()!!.toCharArray().toMutableList())
    }

    // ポーンが置いてある箇所の座標を一次元配列に格納
    val pawns = mutableListOf<Pair<Int, Int>>()
    repeat(9) { i ->
        repeat(9) { j ->
            if (sList[i][j] == '#') pawns.add(Pair(i, j))
        }
    }

    pawns
}