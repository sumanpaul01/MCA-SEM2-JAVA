public class StringBufferCheck {
  public static void main(String[] args) {
      String str = "Hello";
      boolean isStringBuffer = str.getClass().equals(StringBuffer.class);
      
      System.out.println("Is 'str' an instance of StringBuffer? " + isStringBuffer);
  }
}
