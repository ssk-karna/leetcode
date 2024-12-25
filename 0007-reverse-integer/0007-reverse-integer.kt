class Solution {
    fun reverse(x: Int): Int {
          var num = x
     var reverseInt = 0

    while (num != 0){
        var temp = num % 10
        num = num / 10

        if (reverseInt > Integer.MAX_VALUE / 10 || (reverseInt == Integer.MAX_VALUE && reverseInt > 7)){
            return 0
            }
        if (reverseInt < Integer.MIN_VALUE / 10 || (reverseInt == Integer.MIN_VALUE && reverseInt < -8)){
            return 0
        }
        reverseInt = reverseInt * 10 + temp
    }

    return reverseInt
    }
}