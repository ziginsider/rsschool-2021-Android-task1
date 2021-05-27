package subtask2

import kotlin.collections.*

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var summa: Int = bill.sum()
        var dishes: Int = bill.size

        if ((k >= 0) and (k < bill.size)) {
            summa -= bill.get(k)
            dishes -= 1
        }

        var payment: Int = summa / dishes
        var for_return: Int = if (b > payment) b - payment else 0

        if (for_return > 0)
            return for_return.toString()
        else
            return "Bon Appetit"
    }
}
