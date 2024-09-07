class Solution {
    fun isPalindrome(x: Int): Boolean {
        var num = abs(x)
        var reversedInteger = 0
        var remainder = 0
        
        while(num != 0){
            
            remainder = num % 10
            reversedInteger = reversedInteger * 10 + remainder
            num /= 10 
            
        }
        
        return if (reversedInteger == x) true else false
        
    }
}