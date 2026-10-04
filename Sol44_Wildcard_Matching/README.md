LeetCode 44 - Wildcard Matching

This problem is about matching a string with a pattern.

- "?" matches any one character
- "*" matches zero or more characters

I used Dynamic Programming to solve this problem.

Examples

"aa", "a" → false
"aa", "*" → true
"cb", "?a" → false
"adceb", "*a*b" → true
"acdcb", "a*c?b" → false

Complexity

Time: O(m × n)
Space: O(m × n)
