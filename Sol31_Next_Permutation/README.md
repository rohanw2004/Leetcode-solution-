LeetCode 31 - Next Permutation

This problem is about finding the next greater permutation of the given array.

Approach

- Find the first smaller element from the right (pivot).
- Find the next greater element and swap it with the pivot.
- Reverse the elements after the pivot.
- If no pivot is found, reverse the whole array.

Example

Input: "[1, 2, 3]"
Output: "[1, 3, 2]"

Complexity

- Time: O(n)
- Space: O(1)

Solved in Python and Java.
