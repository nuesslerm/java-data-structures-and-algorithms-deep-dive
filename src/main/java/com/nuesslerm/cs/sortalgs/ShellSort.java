package com.nuesslerm.cs.sortalgs;

import java.util.Arrays;

public class ShellSort {
  public static void main(String[] args) {
    int[] intArr = new int[] {20, 35, -15, 7, 55, 1, -22, };

    System.out.println("result: " + Arrays.toString(shellSort(intArr)));
  }

  public static int[] shellSort(int[] arr) {
    System.out.println(arr.length);

    for (int firstUnsortedIndex = 1;
         firstUnsortedIndex < arr.length;
         firstUnsortedIndex++) {

      int newElement = arr[firstUnsortedIndex];

      int i;

      for (i = firstUnsortedIndex - 1; i >= 0 && newElement < arr[i]; i--) {
        arr[i + 1] = arr[i];
      }

      arr[i + 1] = newElement;
    }

    return arr;
  }
}
