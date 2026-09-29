LeetCode 41 - First Missing Positive

Find the smallest positive number that is missing from the array.

Approach

I placed each number at its correct index first, then checked the array from the beginning. The first position that doesn't have the expected number gives the answer.

Examples

- "[1,2,0]" → "3"
- "[3,4,-1,1]" → "2"
- "[7,8,9,11,12]" → "1"

Time: O(n)
Space: O(1)
