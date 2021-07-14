package subtask2


class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
//        if (number < 5) {
//            return null
//        }

        fun square(n: Int): Long = n.toLong() * n
        val numberToDecompose = square(number)

        fun findNumbers(n: Long, k: Int):  Array<Int>? {
            for (i in k - 1 downTo 1) {
                if (square(i) == n) return Array(1) {i}

                val rest = n - square(i)
                if (rest > 0L) {
                    val list = findNumbers(rest, i)
                    if (list != null) {
                        return list.plus(i)
                    }
                }
            }
            return null
        }

        return findNumbers(numberToDecompose, number)
    }
}
