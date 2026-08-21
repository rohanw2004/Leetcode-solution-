LeetCode 13 - Roman to Integer

Problem

Convert a Roman numeral into an integer.

For example:

Input: MCMXCIV
Output: 1994

Approach

I used a HashMap to store the value of each Roman symbol.

I compare the current symbol with the next one:

- If the current value is smaller, I subtract it.
- Otherwise, I add it.

For example:

IV = 5 - 1 = 4
VI = 5 + 1 = 6

Example

III      → 3
LVIII    → 58
MCMXCIV  → 1994

Complexity

- Time: O(n)
- Space: O(1)

What I Learned

This problem helped me understand how comparing the current and next value can handle the Roman numeral subtraction cases.
