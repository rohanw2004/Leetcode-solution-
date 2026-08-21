# LeetCode 17 - Letter Combinations of a Phone Number

## Problem
Given a string of digits from `2` to `9`, return all possible letter combinations based on the old phone keypad.

For example:

`23` → `[ad, ae, af, bd, be, bf, cd, ce, cf]`

## Approach

I used the phone keypad mapping and built the combinations step by step.

- Start with an empty string.
- Take one digit at a time.
- Get the letters for that digit.
- Add each letter to all the combinations we already have.
- Continue until all digits are processed.

## Example

```text
Input: 23

2 → abc
3 → def

Output:
[ad, ae, af, bd, be, bf, cd, ce, cf]
