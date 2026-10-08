LeetCode 47 – Permutations II

This solution finds all unique permutations of an array that can contain duplicate numbers.

I used backtracking and skipped duplicate numbers at the same level so that the same permutation doesn't get added again.

Example

Input: "[1,1,2]"
Output: "[[1,1,2],[1,2,1],[2,1,1]]"

Approach

- Sort the array first.
- Use backtracking to build permutations.
- Keep track of used elements.
- Skip duplicates when they would create the same permutation.

Time Complexity: O(n × n!)
Space Complexity: O(n)
