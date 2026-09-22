LeetCode 37 - Sudoku Solver

This problem is about solving a Sudoku board by filling all the empty cells.

I used backtracking for this. For every empty cell, I try numbers from 1 to 9 and check if the number is valid in that row, column, and 3x3 box. If it doesn't work later, I undo the choice and try another number.

Approach

- Find an empty cell.
- Try numbers from 1 to 9.
- Check whether the number is valid.
- If valid, place it and continue.
- If it leads to a wrong solution, backtrack and try another number.

I also added the LeetCode example in the code so I can run it directly in Acode and see the solved Sudoku in the output.
