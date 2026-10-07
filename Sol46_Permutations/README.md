LeetCode 46 - Permutations

Problem

Given an array of distinct integers, return all possible permutations.

Approach

I used backtracking to generate all the possible arrangements.

I keep adding unused numbers to the current list. When the list contains all numbers, I store it as one permutation. Then I remove the last number and try another choice.

Example

Input:

[1, 2, 3]

Output:

[[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]

Complexity

- Time: O(n × n!)
- Space: O(n) excluding the output

Solved in Python 3 and Java.
