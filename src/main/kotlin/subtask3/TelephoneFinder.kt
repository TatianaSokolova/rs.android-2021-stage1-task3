package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val neighbors = mutableMapOf<Char, List<Char>>()
        neighbors['1'] = arrayListOf('2', '4')
        neighbors['2'] = arrayListOf('1', '3', '5')
        neighbors['3'] = arrayListOf('2', '6')
        neighbors['4'] = arrayListOf('1', '5', '7')
        neighbors['5'] = arrayListOf('2', '4', '6', '8')
        neighbors['6'] = arrayListOf('3', '5', '9')
        neighbors['7'] = arrayListOf('4', '8')
        neighbors['8'] = arrayListOf('5', '7', '9', '0')
        neighbors['9'] = arrayListOf('6', '8')
        neighbors['0'] = arrayListOf('8')

        val result = mutableListOf<String>()
        val numberAr = number.toCharArray()

        for (i in numberAr.indices) {
            for (j in neighbors.keys) {
                if (numberAr[i] == j) {
                    for (k in neighbors[j]!!.indices)
                        result.add(number.replace(numberAr[i], neighbors[j]!![k]))
                }
            }
        }

        if (number.toInt() < 0) {
            return null
        }
        return result.toTypedArray()
    }
}
