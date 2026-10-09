
from typing import List

class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        n = len(matrix)

        # Transpose the matrix
        for i in range(n):
            for j in range(i + 1, n):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

        # Reverse each row
        for row in matrix:
            row.reverse()


# Example 1
matrix1 = [[1, 2, 3],
           [4, 5, 6],
           [7, 8, 9]]

Solution().rotate(matrix1)
print("Example 1 Output:")
for row in matrix1:
    print(row)

# Example 2
matrix2 = [[5, 1, 9, 11],
           [2, 4, 8, 10],
           [13, 3, 6, 7],
           [15, 14, 12, 16]]

Solution().rotate(matrix2)
print("\nExample 2 Output:")
for row in matrix2:
    print(row)
