LeetCode 12 - Integer to Roman

Problem

Convert a given integer into a Roman numeral.

For example:

Input: 58
Output: LVIII

Approach

I used a Greedy approach.

I stored the Roman numeral values from largest to smallest.

Then I:

- Check which value can be used.
- Add its Roman symbol to the answer.
- Subtract that value from the number.
- Continue until the number becomes 0.

For example, "1994":

1994
↓
1000 + 900 + 90 + 4
↓
M + CM + XC + IV
↓
MCMXCIV

Example

Input: 1994

Output: MCMXCIV

Another example:

Input: 58

Output: LVIII

Code

The solution is written in Java.

Complexity

- Time: O(n)
- Space: O(1)

What I Learned

This problem helped me understand the Greedy approach, where we choose the largest possible value first and keep reducing the remaining number.
