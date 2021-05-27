package subtask1

import kotlin.collections.*

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray: ArrayList<Int> = arrayListOf()

        for(index in sadArray.indices) {
            if ((index == 0) or (index == sadArray.lastIndex)) {
                happyArray.add(index)
            } else {
                if (sadArray.get(index) >= sadArray.get(index - 1) + sadArray.get(index + 1))
                    happyArray.add(index)
            }
        }
        return happyArray.toIntArray()
    }
}
