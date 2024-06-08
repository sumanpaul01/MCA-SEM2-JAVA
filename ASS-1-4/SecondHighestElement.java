public class SecondHighestElement {
  public static void main(String[] args) {
      int[] array = {5, 10, 3, 8, 15, 7};

      int max = Integer.MIN_VALUE;
      int secondMax = Integer.MIN_VALUE;

      
      for (int num : array) {
          if (num > max) {
              secondMax = max;
              max = num;
          } else if (num > secondMax && num != max) {
              secondMax = num;
          }
      }

      if (secondMax != Integer.MIN_VALUE) {
          System.out.println("Second highest element in the array: " + secondMax);
      } else {
          System.out.println("Second highest element does not exist in the array.");
      }
  }
}