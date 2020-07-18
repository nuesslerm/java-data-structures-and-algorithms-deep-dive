public class Arrays {
  public static void main(String[] args) {
    // arrays are non-dynamic data structures
    // this array will always be able to only hold 7 elements
    int[] intArr = new int[7];

    intArr[0] = 20;
    intArr[1] = 35;
    intArr[2] = -15;
    intArr[3] = 7;
    intArr[4] = 55;
    intArr[5] = 1;
    intArr[6] = -22;

    for (int i = 0; i < 8; i++) {
      System.out.printf("index %s: %s \n", i, intArr[i]);
    }
  }
}
