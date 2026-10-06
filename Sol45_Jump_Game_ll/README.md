LeetCode 45 - Jump Game II

This problem is about finding the minimum number of jumps needed to reach the last index of an array.

I used a greedy approach. At every step, I keep track of how far I can reach and increase the jump count when I reach the current limit.

Example

Input:
"[2,3,1,1,4]"

Output:
"2"

Approach

- Keep track of the farthest index we can reach.
- Track the end of the current jump.
- When we reach that end, increase the jump count.
- Continue until we reach the last index.

Complexity

Time: "O(n)"
Space: "O(1)"
