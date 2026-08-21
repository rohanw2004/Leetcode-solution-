LeetCode 16 - 3Sum Closest

This problem asks us to find three numbers from the array whose sum is closest to the given target.

Approach

First, I sort the array so that I can use two pointers.

- Fix one number using "i".
- Use "left" and "right" pointers for the other two numbers.
- If the current sum is closer to the target, update the answer.
- If the sum is smaller than the target, move "left".
- Otherwise, move "right".
- If the sum is exactly equal to the target, return it directly.

Example

Input:
nums = [-1, 2, 1, -4]
target = 1

Output:
2

The closest sum is "2", which is only "1" away from the target.

Complexity

- Time: "O(n²)"
- Space: "O(1)" extra space

Languages

- Python
- Java
