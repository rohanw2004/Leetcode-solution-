class Solution:
    def solveSudoku(self, board: list[list[str]]) -> None:
        def solve():
            for row in range(9):
                for col in range(9):

                    if board[row][col] == ".":
                        for num in "123456789":

                            if self.isValid(board, row, col, num):
                                board[row][col] = num

                                if solve():
                                    return True

                                board[row][col] = "."

                        return False

            return True

        solve()

    def isValid(self, board, row, col, num):
        # Check row
        for i in range(9):
            if board[row][i] == num:
                return False

        # Check column
        for i in range(9):
            if board[i][col] == num:
                return False

        # Check 3x3 box
        startRow = (row // 3) * 3
        startCol = (col // 3) * 3

        for i in range(startRow, startRow + 3):
            for j in range(startCol, startCol + 3):
                if board[i][j] == num:
                    return False

        return True


# LeetCode 37 - Sudoku Solver
# Example 1

board = [
    ["5", "3", ".", ".", "7", ".", ".", ".", "."],
    ["6", ".", ".", "1", "9", "5", ".", ".", "."],
    [".", "9", "8", ".", ".", ".", ".", "6", "."],
    ["8", ".", ".", ".", "6", ".", ".", ".", "3"],
    ["4", ".", ".", "8", ".", "3", ".", ".", "1"],
    ["7", ".", ".", ".", "2", ".", ".", ".", "6"],
    [".", "6", ".", ".", ".", ".", "2", "8", "."],
    [".", ".", ".", "4", "1", "9", ".", ".", "5"],
    [".", ".", ".", ".", "8", ".", ".", "7", "9"]
]

print("Example 1 - Input:")
for row in board:
    print(" ".join(row))

Solution().solveSudoku(board)

print("\nExample 1 - Output:")
for row in board:
    print(" ".join(row))