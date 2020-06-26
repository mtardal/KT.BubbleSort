val intArray = arrayOf(4,3,78,2,0,2)

fun bubble(array: Array<Int>): Array<Int> {
    var sorted = false

    while (!sorted) {
        sorted = true
        for ((i, int) in array.withIndex()) {
            if (i == array.lastIndex) continue

            var currentInt = array[i]
            var nextInt = array[i + 1]

            if (array[i] > array[i + 1]) {
                array[i] = nextInt
                array[i + 1] = currentInt
                sorted = false
            }
        }
    }
    return array
}

fun main() {
   // println(array.joinToString())
    bubble(intArray)
    print("new: "); println(intArray.joinToString())
}
