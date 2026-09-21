LeetCode 36 - Valid Sudoku

This solution checks whether a Sudoku board is valid or not.

I used sets to keep track of numbers in:

- Each row
- Each column
- Each 3x3 box

If a number is repeated in any of them, the board is invalid.

Examples

- Example 1 → "True"
- Example 2 → "False"

Languages

- Python
- Java

Time Complexity

O(1) because the board is always 9x9.

Space Complexity

O(1) for the fixed-size Sudoku board.
