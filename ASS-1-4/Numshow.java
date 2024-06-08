class Num {
  protected int number;

  public Num(int number) {
      this.number = number;
  }

  public void shownum() {
      System.out.println("Decimal Value: " + number);
  }
}

class HexNum extends Num {
  public HexNum(int number) {
      super(number);
  }

  public void shownum() {
      System.out.println("Hexadecimal Value: " + Integer.toHexString(number));
  }
}

public class Numshow {
  public static void main(String[] args) {
      // Creating an instance of Num
      Num numObj = new Num(255);

      System.out.println("Using base class Num:");
      numObj.shownum();

      HexNum hexNumObj = new HexNum(255);

      System.out.println("\nUsing derived class HexNum:");
      hexNumObj.shownum();
  }
}