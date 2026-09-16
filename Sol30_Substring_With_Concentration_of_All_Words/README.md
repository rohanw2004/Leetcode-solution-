LeetCode 30 - Substring with Concatenation of All Words

Problem

Given a string "s" and an array of words, find all starting indexes where all the words appear together in any order.

Approach

I used a HashMap to store the frequency of each word and checked the string in word-length chunks.

Languages

- Python
- Java

Examples

Input: s = "barfoothefoobarman"
words = ["foo", "bar"]

Output: [0, 9]

Input: s = "barfoofoobarthefoobarman"
words = ["bar", "foo", "the"]

Output: [6, 9, 12]

Complexity

- Time: O(n × number of words)
- Space: O(number of words)

Solved as part of my LeetCode practice.
