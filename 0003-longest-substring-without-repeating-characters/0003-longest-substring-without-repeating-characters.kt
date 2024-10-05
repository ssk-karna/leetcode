class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var result = StringBuilder()
        var temp = StringBuilder()
        
        for(str in s){
            if(!temp.contains(str)){
                temp.append(str)
            }
            else {
                while(temp.contains(str)){
                    temp.deleteCharAt(0)
                }
                temp.append(str)
            }
    
            if(temp.length > result.length){
                result = StringBuilder(temp)
            }
            
        }
        
        return result.length
    }
}