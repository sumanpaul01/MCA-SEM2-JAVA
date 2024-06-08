//2.25
// 1          1 
// 2      2 
//   3  3 
//     4
public class patternprinter_03 {
  public static void main(String[] args) {
      int rows = 4;
      for (int i = 1; i <= rows; i++) {
          // Print spaces
          for (int j = 1; j < i; j++) {
              System.out.print("  ");
          }

          // Print number
          System.out.print(i);

          // Print spaces
          for (int k = 1; k <= 4 * (rows - i); k++) {
              System.out.print(" ");
          }

          // Print number (if not the last row)
          if (i < rows) {
              System.out.println(i);
          } else {
              System.out.println();
          }
      }
  }
}
