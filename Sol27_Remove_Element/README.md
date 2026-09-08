LeetCode 27 – Remove Element

Approach

I used a two-pointer approach. "i" checks each element, while "index" keeps track of the position for the next element that is not equal to "val".

Example

Input:  nums = [3,2,2,3], val = 3
Output: 2
Array:  [2,2]

The elements are modified in-place, so no extra array is needed.

Complexity

- Time: O(n)
- Space: O(1)
