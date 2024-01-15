package com.vmelnyk.geeks4geeks.antiDiagonalTraversalOfMatrix;

class Solution {
  public int[] antiDiagonalPattern(int[][] matrix) {
    // Code here
    final int rows = matrix.length;

    if (rows == 0) {
      return new int[0];
    }

    final int cols = matrix[0].length;
    final int[] result = new int[rows * cols];
    int r = 0;
    for (int slice = 0; slice < rows + cols - 1; slice++) {
      System.out.printf("Anti-Diagonal %d: ", slice);
      int z1 = slice < cols ? 0 : slice - cols + 1;
      int z2 = slice < rows ? 0 : slice - rows + 1;
      for (int j = slice - z1; j >= z2; j--) {
        final int value = matrix[slice - j][j];
        result[r++] = value;
        System.out.printf("%d ", value);
      }
      System.out.println();
    }
    return result;
  }
}
