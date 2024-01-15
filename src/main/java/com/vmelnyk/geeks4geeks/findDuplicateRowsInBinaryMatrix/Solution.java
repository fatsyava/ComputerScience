package com.vmelnyk.geeks4geeks.findDuplicateRowsInBinaryMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
  public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n) {
    // code here
    Set<Row> rows = new HashSet<>();
    ArrayList<Integer> duplicatedRows = new ArrayList<>();
    for (int r = 0; r < m; r++) {
      if (!rows.add(new Row(matrix[r]))) {
        duplicatedRows.add(r);
      }
    }
    return duplicatedRows;
  }
}

final class Row {
  int[] data;

  Row(int[] data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Row row = (Row) o;
    return Arrays.equals(data, row.data);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(data);
  }
}
