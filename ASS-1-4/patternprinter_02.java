//2.24
//     1 
//   2 1 2 
//  3 2 1 2 3 
// 4 3 2 1 2 3 4
public class patternprinter_02 {
  public static void main(String[] args) {
      int rows = 4;
      for (int i = 1; i <= rows; i++) {
          // Print spaces
          for (int j = rows - i; j >= 1; j--) {
              System.out.print("  ");
          }

          // Print decreasing numbers
          for (int k = i; k >= 1; k--) {
              System.out.print(k + " ");
          }

          // Print increasing numbers
          for (int l = 2; l <= i; l++) {
              System.out.print(l + " ");
          }

          // Move to the next line
          System.out.println();
      }
  }
}
