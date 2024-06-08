class Num {
  protected int number;
  public Num(int number) {
      this.number = number;
  }
  public void showNum() {
      System.out.println("Number: " + number);
  }
}
class OctNum extends Num {
  public OctNum(int number) {
      super(number);
  }
  public void showNum() {
      System.out.println("Octal Value: " + Integer.toOctalString(number));
  }
}
public class octalnum {
  public static void main(String[] args) {
      Num num = new Num(10);
      OctNum octNum = new OctNum(10);
      System.out.println("Num Class:");
      num.showNum();  // Displays the number
      System.out.println("\nOctNum Class:");
      octNum.showNum();  
  }
}
