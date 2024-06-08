public class StringPerformanceComparator {
  public static void main(String[] args) {
     
      String string1 = "Hello";
      String string2 = "World";

      
      long startTimeConcat1 = System.nanoTime();
      for (int i = 0; i < 100000; i++) {
          String result = string1 + string2;
      }
      long endTimeConcat1 = System.nanoTime();
      long durationConcat1 = endTimeConcat1 - startTimeConcat1;

      
      long startTimeBuilder1 = System.nanoTime();
      for (int i = 0; i < 100000; i++) {
          StringBuilder builder = new StringBuilder(string1);
          builder.append(string2);
          String result = builder.toString();
      }
      long endTimeBuilder1 = System.nanoTime();
      long durationBuilder1 = endTimeBuilder1 - startTimeBuilder1;

     
      long startTimeConcat2 = System.nanoTime();
      for (int i = 0; i < 100000; i++) {
          String result = string2 + string1;
      }
      long endTimeConcat2 = System.nanoTime();
      long durationConcat2 = endTimeConcat2 - startTimeConcat2;

      
      long startTimeBuilder2 = System.nanoTime();
      for (int i = 0; i < 100000; i++) {
          StringBuilder builder = new StringBuilder(string2);
          builder.append(string1);
          String result = builder.toString();
      }
      long endTimeBuilder2 = System.nanoTime();
      long durationBuilder2 = endTimeBuilder2 - startTimeBuilder2;

      
      System.out.println("Performance comparison of string concatenation:");
      System.out.println("String1 + String2: " + durationConcat1 + " nanoseconds");
      System.out.println("StringBuilder for String1: " + durationBuilder1 + " nanoseconds");
      System.out.println("String2 + String1: " + durationConcat2 + " nanoseconds");
      System.out.println("StringBuilder for String2: " + durationBuilder2 + " nanoseconds");
  }
}
