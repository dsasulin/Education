/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

*/

object Solution {
    def isValid(s: String): Boolean = {
        var i = 0
        var open = false
         var stv = 'f'
        val stack = new scala.collection.mutable.Stack[Char]
        if (s.length == 1 || s.length%2 != 0 ) {return false}
        if ((s.head == ')') || (s.head == '}') || (s.head == ']')) {return  false}  
        for (i<-0 until s.length)
        {
         var stv = 'f'
         if (s(i) == '(') {stack.push(')')}
         if (s(i) == '{') {stack.push('}')}
         if (s(i) == '[')  {stack.push(']')}
         if (stack.isEmpty) {return false }
         if (s(i) == ')' && stack.isEmpty != true)
            { stv = stack.pop()
            if (s(i)== stv ) { open =  true}
               else {return false}}

         if ((s(i) == '}') && stack.isEmpty != true)
            {  stv = stack.pop()
            if (s(i) == stv ) {open =  true}
               else {return false}
            }

         if ((s(i) == ']') && stack.isEmpty != true)  {  stv = stack.pop()
            if (s(i)== stv ) {open =  true} else {return  false}}
        }
        if (stack.isEmpty != true) {open =  false}
    return open
    }
    
}