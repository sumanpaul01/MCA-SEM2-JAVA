class Num {
  int number;
  public Num(int number) {
      this.number = number;
  }
  public void shownum() {
      System.out.println("Decimal: " + number);
  }
}
class HexNum extends Num {
  public HexNum(int number) {
      super(number);
  }
  public void shownum() {
      System.out.println("Hexadecimal: " + Integer.toHexString(number));
  }
}
class OctNum extends Num {
  public OctNum(int number) {
      super(number);
  }
  public void shownum() {
      System.out.println("Octal: " + Integer.toOctalString(number));
  }
}
public class merge10_11 {
  public static void main(String[] args) {
      Num num1 = new Num(10);
      num1.shownum();  
      HexNum hex_num = new HexNum(255);
      hex_num.shownum();
      OctNum oct_num = new OctNum(64);
      oct_num.shownum();
  }
}
