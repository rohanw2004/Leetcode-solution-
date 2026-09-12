LeetCode 3 - Longest Substring Without Repeating Characters

This problem asks us to find the length of the longest substring without repeating characters.

I used a sliding window approach with an array to store the last index of each character.

Examples

- "abcabcbb" → "3"
- "bbbbb" → "1"
- "pwwkew" → "3"

Complexity

- Time: O(n)
- Space: O(1)
