public class ParameterizedConstructor {
  private int value;

  
  public ParameterizedConstructor(int value) {
      
      this.value = value;
  }

  
  public int getValue() {
      return this.value;
  }

  public static void main(String[] args) {
      
      ParameterizedConstructor obj = new ParameterizedConstructor(10);

      
      System.out.println("Value initialized with parameterized constructor: " + obj.getValue());
  }
}