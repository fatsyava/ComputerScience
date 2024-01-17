package com.vmelnyk.geeks4geeks._20240116AllUniquePermutationsOfArray;

import java.util.*;

class Solution {
  static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
    // code here
    Solution solution = new Solution();
    return solution.permuteUniqueArrays(arr, n);
  }

  ArrayList<ArrayList<Integer>> permuteUniqueArrays(ArrayList<Integer> arr, int n) {
    final Comparator<ArrayList<Integer>> intListsComparator =
        (o1, o2) -> {
          int j = 0;
          while (j < o1.size() && j < o2.size()) {
            if (o1.get(j) > o2.get(j)) {
              return 1;
            } else if (o1.get(j) < o2.get(j)) {
              return -1;
            }
            j++;
          }
          return Integer.compare(o1.size(), o2.size());
        };

    final Set<ArrayList<Integer>> uniques = new HashSet<>();

    int[] indexes = new int[n];
    Arrays.fill(indexes, 0);

    uniques.add(new ArrayList<>(arr));

    int permutations = 0;
    int i = 0;
    while (i < n) {
      if (indexes[i] < i) {
        Collections.swap(arr, i % 2 == 0 ? 0 : indexes[i], i);
        uniques.add(new ArrayList<>(arr));
        indexes[i]++;
        i = 0;
      } else {
        indexes[i] = 0;
        i++;
      }
      permutations++;
    }

//    System.out.println("Total permutations: " + permutations);
//    System.out.println("Unique permutations: " + uniques.size());

    final ArrayList<ArrayList<Integer>> result = new ArrayList<>(uniques);
    result.sort(intListsComparator);
    return result;
  }
}
