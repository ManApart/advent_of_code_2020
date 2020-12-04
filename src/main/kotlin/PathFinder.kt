val day3Paths = listOf(
    Pair(1, -1),
    Pair(3, -1),
    Pair(5, -1),
    Pair(7, -1),
    Pair(1, -2),
)


fun countTreesForMultiplePaths(steps: List<Pair<Int, Int>>, grid: Grid): Long {
    val treeList = steps.map { countTrees(it.first, it.second, grid).toLong() }
    println(treeList)
    return treeList.reduce {
            acc: Long, i: Long -> i * acc
    }
}

fun countTrees(stepX: Int, stepY: Int, grid: Grid): Int {
    var x = 0
    var y = grid.height - 1
    var count = 0
    while (y >= 0) {
        if (grid.isTree(x, y)) {
            count++
        }
        x += stepX
        y += stepY
    }

    return count
}