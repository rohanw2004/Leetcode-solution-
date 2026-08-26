LeetCode 20 - Valid Parentheses

Problem

Given a string containing "()", "[]", and "{}", check if the brackets are valid.

A bracket is valid when:

- Every opening bracket has a closing bracket.
- The brackets are closed in the correct order.

Approach

I used a Stack for this problem.

Whenever I find an opening bracket, I add it to the stack.
For a closing bracket, I check the top element of the stack. If it matches, I remove it. If it doesn't match, the string is not valid.

At the end, the stack should be empty.

Examples

Input: "()"
Output: true

Input: "()[]{}"
Output: true

Input: "(]"
Output: false

Input: "([)]"
Output: false

Input: "{[]}"
Output: true

Complexity

- Time: "O(n)"
- Space: "O(n)"

Languages

- Python
- Java
