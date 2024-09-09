/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        
        var currentNode1 = l1
        var currentNode2 = l2
        
        val tempHead = ListNode(0)
        var currentResultNode = tempHead
        
        var carry = 0
        
        while (currentNode1 != null || currentNode2 != null){
            
            val value1 = currentNode1?.`val` ?: 0
            val value2 = currentNode2?.`val` ?: 0
            
            val sum = carry + value1 + value2
            carry = sum/10
            val digit = sum % 10
            
            currentResultNode.next = ListNode(digit)
            currentResultNode = currentResultNode.next!!
            
            currentNode1 = currentNode1?.next
            currentNode2 = currentNode2?.next
        }
            if(carry > 0){
                currentResultNode.next = ListNode(carry)
        }
            return tempHead.next
    }
}
