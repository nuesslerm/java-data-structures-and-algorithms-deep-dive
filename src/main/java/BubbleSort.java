import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] intArr = new int[] {20, 35, -15, 7, 55, 1, -22};

    // System.out.println("result: " + Arrays.toString(bubbleSort(new int[] {-2, 32, 1, -23, 90})));
    System.out.println("result: " + Arrays.toString(bubbleSort(intArr)));
  }

  public static int[] bubbleSort(int[] arr) {
    for (int lastUnsortedIndex = arr.length - 1;
             lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
      for (int i = 0; i < lastUnsortedIndex; i++) {
        if (arr[i] > arr[i + 1]) swap(arr, i, i + 1);
      }
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
