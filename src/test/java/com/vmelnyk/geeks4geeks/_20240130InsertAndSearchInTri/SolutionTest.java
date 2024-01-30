package com.vmelnyk.geeks4geeks._20240130InsertAndSearchInTri;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void insertAndSearch() {
    List<String> list = Arrays.asList("the", "a", "there", "answer", "any", "by", "bye", "their");

    final Solution.TrieNode root = new Solution.TrieNode();
    for (String s : list) {
      Solution.insert(root, s);
    }

    assertTrue(Solution.search(root, "the"));
    assertFalse(Solution.search(root, "geeks"));
  }

  @Test
  void insertAndSearchN94() {
    List<String> list =
        Arrays.asList(
            "og", "gg", "goq", "qor", "r", "otgr", "q", "ortg", "t", "gggr", "oqrr", "t", "rtgt",
            "rt", "rr", "g", "o", "ortr", "rg", "qqq", "gqog", "g", "oro", "gq", "roo", "o", "tort",
            "to", "qgr", "tttt", "gqot", "g", "gqtq", "ogg", "to", "trt", "qt", "rr", "ro", "orq",
            "rqr", "qqr", "qtg", "o", "trqr", "q", "gg", "orog", "grt", "o", "ogr", "rqqo", "torg",
            "otrq", "grq", "gggg", "rt", "tgo", "qttr", "r", "oqr", "q", "qg", "ttr", "qt", "tr",
            "oott", "ro", "gtrg", "t", "ggqr", "qo", "qoq", "otoq", "too", "trgg", "oq", "trr",
            "orr", "rt", "go", "oroo", "rgrt", "rt", "oqot", "t", "ttq", "orro", "gro", "qt", "tq",
            "gtqr");

    final Solution.TrieNode root = new Solution.TrieNode();
    for (String s : list) {
      Solution.insert(root, s);
    }

    assertFalse(Solution.search(root, "qto"));
  }
}
