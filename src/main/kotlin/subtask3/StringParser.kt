package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var outputString: ArrayList<String> = arrayListOf()
        var find_char: String = ""
        var word: String = ""

        for(char in inputString.toString()){
            if (find_char == "") {
                find_char = when (char) {
                    '[' -> "]"
                    '(' -> ")"
                    '<' -> ">"
                    else -> ""
                }
            } else {
                if (char.toString() == find_char) {
                    find_char = ""
                    outputString.add(word)
                } else {
                    word += char.toString()
                }
            }
        }
        return outputString.toTypedArray()
    }
}
