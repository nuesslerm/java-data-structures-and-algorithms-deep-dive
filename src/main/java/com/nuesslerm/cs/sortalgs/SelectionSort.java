package com.nuesslerm.cs.sortalgs;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] intArr = new int[] {20, 35, -15, 7, 55, 1, -22};

    System.out.println("result: " + Arrays.toString(selectionSort(intArr)));
  }

  public static int[] selectionSort(int[] arr) {
    for (int lastUnsortedIndex = arr.length - 1;
         lastUnsortedIndex > 0;
         lastUnsortedIndex--) {
      int largest = 0;

      for (int i = 0; i <= lastUnsortedIndex; i++) {
        if (arr[i] > arr[largest]) largest = i;
      }

      swap(arr, largest, lastUnsortedIndex);
    }

    return arr;
  }

  public static void swap(int[] arr, int i, int j) {
    if (i == j) return;

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
