LeetCode 18 - 4Sum

This is my solution for LeetCode 18 - 4Sum.

Problem

Given an integer array and a target value, find all unique groups of four numbers whose sum is equal to the target.

Approach

I sorted the array first and used two loops to select the first two numbers. For the remaining two numbers, I used the two pointer approach.

If the sum is smaller than the target, I move "left". If the sum is bigger, I move "right". When the sum matches, I add the four numbers to the result.

I also skipped duplicate values to avoid getting the same combination multiple times.

Example

Input:
nums = [1,0,-1,0,-2,2]
target = 0

Output:
[[-2,-1,1,2],
 [-2,0,0,2],
 [-1,0,0,1]]

Complexity

- Time: "O(n³)"
- Space: "O(1)" extra space

Languages

- Java
- Python

This problem was good practice for understanding how sorting and two pointers can be used together.
