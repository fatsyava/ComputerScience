package com.vmelnyk.geeks4geeks.largestRectangularSubMatrixWhoseSumIs0;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
  public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] matrix) {
    // code here
    int n = matrix.length;
    int m = matrix[0].length;
    // stores the prefixSum of rows
    int[][] prefixSum = new int[n][m];
    for (int i = 0; i < n; i++) {
      System.arraycopy(matrix[i], 0, prefixSum[i], 0, m);
    }

    // calculation prefix sum for each row
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < m; j++) {
        prefixSum[i][j] += prefixSum[i][j - 1];
      }
    }

    int startCol = 0, endCol = 0, startRow = 0, endRow = 0;
    int maxSize = 0;
    for (int firstCol = 0; firstCol < m; firstCol++) {
      for (int secondCol = firstCol; secondCol < m; secondCol++) {
        int[] tmp = new int[n];

        // stores the sum between two columns for each row
        for (int row = 0; row < n; row++) {
          tmp[row] = prefixSum[row][secondCol] - (firstCol > 0 ? prefixSum[row][firstCol - 1] : 0);
        }

        int curSum = 0;
        HashMap<Integer, Integer> rowSumMap = new HashMap<>();
        rowSumMap.put(0, -1);
        for (int curRow = 0; curRow < n; curRow++) {
          curSum += tmp[curRow];
          if (rowSumMap.containsKey(curSum)) {
            int subMatrixSize = (secondCol - firstCol + 1) * (curRow - rowSumMap.get(curSum));
            if (subMatrixSize > maxSize) {
              maxSize = subMatrixSize;
              startCol = firstCol;
              endCol = secondCol;
              startRow = rowSumMap.get(curSum) + 1;
              endRow = curRow;
            }
          } else {
            rowSumMap.put(curSum, curRow);
          }
        }
      }
    }

    final ArrayList<ArrayList<Integer>> retval = new ArrayList<>();
    if (maxSize > 0) {
      for (int i = startRow; i <= endRow; i++) {
        ArrayList<Integer> row = new ArrayList<>();
        for (int j = startCol; j <= endCol; j++) {
          row.add(matrix[i][j]);
        }
        retval.add(row);
      }
    }
    return retval;
  }

  static int findMaximumSubMatrixWithZeroSum(int[][] matrix, int n, int m) {
    // stores the prefixSum of rows
    int[][] prefixSum = new int[n][m];
    for (int i = 0; i < n; i++) {
        System.arraycopy(matrix[i], 0, prefixSum[i], 0, m);
    }

    // calculation prefix sum for each row
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < m; j++) {
        prefixSum[i][j] += prefixSum[i][j - 1];
      }
    }

    int startCol = 0, endCol = 0, startRow = 0, endRow = 0;
    int maxSize = 0;
    for (int firstCol = 0; firstCol < m; firstCol++) {
      for (int secondCol = firstCol; secondCol < m; secondCol++) {
        int[] tmp = new int[n];

        // stores the sum between two columns for each row
        for (int row = 0; row < n; row++) {
          tmp[row] = prefixSum[row][secondCol] - (firstCol > 0 ? prefixSum[row][firstCol - 1] : 0);
        }

        int curSum = 0;
        HashMap<Integer, Integer> rowSumMap = new HashMap<>();
        rowSumMap.put(0, -1);
        for (int curRow = 0; curRow < n; curRow++) {
          curSum += tmp[curRow];
          if (rowSumMap.containsKey(curSum)) {
            int subMatrixSize = (secondCol - firstCol + 1) * (curRow - rowSumMap.get(curSum));
            if (subMatrixSize > maxSize) {
              maxSize = subMatrixSize;
              startCol = firstCol;
              endCol = secondCol;
              startRow = rowSumMap.get(curSum) + 1;
              endRow = curRow;
            }
          } else {
            rowSumMap.put(curSum, curRow);
          }
        }
      }
    }

    if (maxSize == 0) {
      System.out.println("There exists no sub-matrix with zero sum");
      return 0;
    }
    System.out.println("Largest Sub-matrix with zero Sum");
    for (int i = startRow; i <= endRow; i++) {
      for (int j = startCol; j <= endCol; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    return maxSize;
  }
}
