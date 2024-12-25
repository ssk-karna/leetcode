class Solution {
    fun isValid(s: String): Boolean {
           var bracketMap = mapOf(')' to '(', '}' to '{', ']' to '[')
    var stack = mutableListOf<Char>()

    for (char in s){
        if (char in bracketMap.values){
            stack.add(char)
        }
        else if (char in bracketMap.keys){
            if (stack.isEmpty() || stack.removeAt(stack.size - 1) != bracketMap[char])
                return false
        }

    }
    return stack.isEmpty()
    }
}