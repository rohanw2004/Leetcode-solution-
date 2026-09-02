LeetCode 24 - Swap Nodes in Pairs

This problem is about swapping every two nodes in a linked list.

For example:

"1 -> 2 -> 3 -> 4"

becomes:

"2 -> 1 -> 4 -> 3"

I used a dummy node to make the swapping easier. Then I take two nodes at a time and change their links.

Example

Input:
"1 -> 2 -> 3 -> 4"

Output:
"2 -> 1 -> 4 -> 3"

Complexity

- Time: O(n)
- Space: O(1)
