LeetCode 14 – Longest Common Prefix

Problem

Given an array of strings, find the longest common prefix shared by all the strings.

Approach

I first sort the strings. After sorting, the first and last strings will be the most different, so I only need to compare them.

If their characters match, I add them to the answer. When they don't match, I stop.

Example

Input:  ["flower", "flow", "flight"]
Output: "fl"

Complexity

- Time: "O(n log n)" because of sorting
- Space: "O(1)" extra space (apart from the sorting used by the language)

Languages

- Python
- Java
