LeetCode 39 - Combination Sum

This problem is about finding all possible combinations of numbers that add up to a given target.

I used backtracking here. The basic idea is to pick a number, continue adding numbers, and if the sum becomes too large, go back and try another choice.

Example

Input:
candidates = [2,3,6,7]
target = 7

Output:
[[2,2,3],[7]]

Approach

- Pick a number from the array.
- Add it to the current combination.
- Continue until the target is reached.
- If the sum goes above the target, stop that path.
- Remove the last number and try another combination.

One thing to remember is that the same number can be used multiple times.

Language: Java
Topic: Backtracking
