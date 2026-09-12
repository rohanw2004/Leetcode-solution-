LeetCode 28 - Find the Index of the First Occurrence

This solution finds the first position where the "needle" string appears inside the "haystack" string.

I used a simple loop and checked each possible substring until the match was found. If there is no match, it returns "-1".

Examples

- "sadbutsad", "sad" → "0"
- "leetcode", "leeto" → "-1"
- "hello", "ll" → "2"

Languages: Java, Python
