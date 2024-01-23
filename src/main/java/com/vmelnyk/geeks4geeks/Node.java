package com.vmelnyk.geeks4geeks;

public class Node {
  public final int data;
  public final Node left;
  public final Node right;

  public Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }

  public Node(int data, Node left, Node right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
}
