package subtask2

import kotlin.math.pow
import kotlin.math.sqrt

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        if (number < 5) {
            return null
        }
        fun square(n: Int): Long = n.toLong() * n.toLong()

        val numberToDecompose = square(number)

        val result = mutableListOf<Int>()

        var f: Long = 0

//        for (i in numberToDecompose downTo 0) {
//            if (i.toDouble().pow(2).toInt() < numberToDecompose) {
//                firstNum = i.toInt()
//                result.add(i.toInt())
//                break
//            }
//        }
//
//        var rest = number - firstNum

//        fun check(list: MutableList<Int>): Boolean {
//            val checkResult = mutableSetOf<Int>()
//            checkResult.addAll(list)
//            return result.size == checkResult.size
//        }

        fun findNumbers(n: Long, k: Int): MutableList<Int> {
            for (i in k-1 downTo 1) {
                if (square(k) == n) {
                    result.add(i)
                    val rest = n - square(i)
                    val next = sqrt(rest.toDouble()).toInt()
                    if (rest.toInt() == 1) {
                        result.add(1)
                    } else {
                        findNumbers(rest, next)
                    }
                }
            }
            return result
        }

        //findNumbers(numberToDecompose, number)

        return findNumbers(numberToDecompose, number).toTypedArray()
    }
}
