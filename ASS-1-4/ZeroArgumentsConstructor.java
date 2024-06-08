public class ZeroArgumentsConstructor {
  private int value;

  
  public ZeroArgumentsConstructor() {
      
      this.value = 0;
  }

  
  public int getValue() {
      return this.value;
  }

  public static void main(String[] args) {
      
      ZeroArgumentsConstructor obj = new ZeroArgumentsConstructor();

      
      System.out.println("Value initialized with zero-arguments constructor: " + obj.getValue());
  }
}