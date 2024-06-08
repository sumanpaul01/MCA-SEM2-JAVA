public class MethodOverloadingExample {
  public int add(int a, int b) {
      return a + b;
  }
  public int add(int a, int b, int c) {
      return a + b + c;
  }
  public double add(double a, double b) {
      return a + b;
  }
  public String concatenate(String str1, String str2) {
      return str1 + str2;
  }
  public static void main(String[] args) {
      MethodOverloadingExample example = new MethodOverloadingExample();
      System.out.println("Sum (int): " + example.add(5, 10));
      System.out.println("Sum (int): " + example.add(5, 10, 15));
      System.out.println("Sum (double): " + example.add(3.5, 2.5));
      System.out.println("Concatenation: " + example.concatenate("Hello, ", "world!"));
  }
}
