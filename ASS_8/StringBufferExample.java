public class StringBufferExample {
  public static void main(String[] args) {
      StringBuffer buffer = new StringBuffer();
      buffer.append("Hello");
      buffer.append(" ");
      buffer.append("World");
      
      System.out.println(buffer.toString());
  }
}
