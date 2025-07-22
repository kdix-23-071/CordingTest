fun isValid(s: String): Boolean {
    val stack = mutableListOf<Char>()
    val map = mapOf('(' to ')', '{' to '}', '[' to ']')

    for (char in s) {
        if (char in map.keys) {
            stack.add(char)
        } else if (char in map.values) {
            if (stack.isEmpty() || map[stack.removeAt(stack.size - 1)] != char) {
                return false
            }
        }
    }
    return stack.isEmpty()
}

fun main() {
    val s1 = "()"
    val s2 = "({[]})"
    val s3 = "({[})"

    println("入力:s=\"$s1\"")
    println("出力:${isValid(s1)}")
    println("入力:s=\"$s2\"")
    println("出力:${isValid(s2)}")
    println("入力:s=\"$s3\"")
    println("出力:${isValid(s3)}")
}