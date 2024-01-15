package com.vmelnyk.leetcode._2352EqualRowAndColumnPairs;

import java.util.*;

class Solution {

  public int equalPairs(int[][] grid) {
    final int n = grid.length;
    int ans = 0;

    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        int k = 0;
        for (; k < n; ++k) {
          if (grid[i][k] != grid[k][j]) {
            break;
          }
        }
        if (k == n) { // R[i] == C[j]
          ++ans;
        }
      }
    }

    return ans;
  }

  public int equalPairs1(int[][] grid) {
    final int n = grid.length;

    final Set<Tuple> rowsCols = new HashSet<>();
    final Set<Tuple> colsRows = new HashSet<>();

    for (int t = 0; t < n; t++) {
      final Tuple rowTuple = new Tuple(grid[t], t);
      final Tuple columnTuple = new Tuple(grid, t);
      rowsCols.add(rowTuple);
      colsRows.add(columnTuple);
    }

    int count = 0;
    for (int t = 0; t < n; t++) {
      final Tuple rowTuple = new Tuple(grid[t], t);
      final Tuple columnTuple = new Tuple(grid, t);

      if (rowsCols.remove(columnTuple)) {
        count++;
        colsRows.remove(columnTuple);
      }
      if (colsRows.remove(rowTuple)) {
        count++;
        rowsCols.remove(rowTuple);
      }
    }

    return count;
  }

  static class Tuple {
    final int[] rowRef;
    final int[][] gridRef;
    final int col;
    final int row;
    final int n;
    final Integer hashcode;

    Tuple(int[] row, int r) {
      this.rowRef = row;
      this.gridRef = null;
      this.col = -1;
      this.row = r;
      this.n = row.length;
      this.hashcode = _hashCode_();
    }

    Tuple(int[][] grid, int column) {
      this.rowRef = null;
      this.gridRef = grid;
      this.col = column;
      this.row = -1;
      this.n = grid[0].length;
      this.hashcode = _hashCode_();
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("Tupple{");
      if (rowRef != null) {
        sb.append("r:").append(row).append(", data:").append(Arrays.toString(rowRef));
      } else if (gridRef != null) {
        sb.append("c:").append(col).append(", data:[");
        for (int i = 0; i < n; i++) {
          if (i > 0) {
            sb.append(",");
          }
          sb.append(gridRef[i][col]);
        }
        sb.append("]");
      }
      sb.append("}");
      return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Tuple tuple = (Tuple) o;

      boolean equals = true;
      if (rowRef != null && tuple.gridRef != null) {
        for (int i = 0; i < n; i++) {
          equals &= rowRef[i] == tuple.gridRef[i][tuple.col];
        }
      } else if (gridRef != null && tuple.rowRef != null) {
        for (int i = 0; i < n; i++) {
          equals &= gridRef[i][col] == tuple.rowRef[i];
        }
      } else {
        equals = false;
      }

      return equals;
    }

    @Override
    public int hashCode() {
      return hashcode;
    }

    private int _hashCode_() {
      int result = 1;

      if (gridRef != null) {
        for (int row = 0; row < n; row++) {
          result += 31 * result + Integer.hashCode(gridRef[row][col]);
        }
      } else if (rowRef != null) {
        for (int n : rowRef) {
          result += 31 * result + Integer.hashCode(n);
        }
      }

      return result;
    }
  }
}
