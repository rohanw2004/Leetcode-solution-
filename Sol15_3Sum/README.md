LeetCode 15 - 3Sum

Problem

Find all unique triplets in an array whose sum is "0".

Example

Input:  [-1, 0, 1, 2, -1, -4]

Output: [[-1, -1, 2], [-1, 0, 1]]

My Approach

First, I sort the array. Then I fix one number and use two pointers ("left" and "right") to find the other two numbers.

- If the sum is "0", I save the triplet.
- If the sum is smaller than "0", I move "left".
- If the sum is bigger than "0", I move "right".
- I skip duplicate values so the same triplet isn't added again.

This reduces the solution from a brute-force "O(n³)" approach to "O(n²)".

Complexity

- Time: "O(n²)"
- Space: "O(1)" excluding the output

Languages

- Python
- Java

LeetCode: #15
Difficulty: Medium
