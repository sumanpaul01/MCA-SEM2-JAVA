public class SparseMatrix {
  public static void main(String[] args) {
      int[][] matrix = {
          {1, 0, 0},
          {0, 0, 0},
          {0, 0, 3}
      };

      int zeroCount = 0;
      int nonZeroCount = 0;

      
      for (int[] row : matrix) {
          for (int element : row) {
              if (element == 0) {
                  zeroCount++;
              } else {
                  nonZeroCount++;
              }
          }
      }

      
      if (zeroCount > nonZeroCount) {
          System.out.println("The given matrix is sparse.");
      } else {
          System.out.println("The given matrix is not sparse.");
      }
  }
}