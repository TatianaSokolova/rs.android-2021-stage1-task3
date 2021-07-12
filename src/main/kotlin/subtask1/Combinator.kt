package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {

        fun findFactorial(num: Long): Long = if (num < 2) 1 else num * findFactorial(num - 1)

        val m = array[0].toLong()
        val n = array[1].toLong()
        var k: Long = 0

        for (i in 1..n) {
            k = findFactorial(n) / (findFactorial(i)*findFactorial(n - i))
            if ( k == m) return i.toInt()
        }
        return null
    }
}
