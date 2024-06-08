//2.23
public class patternprinter_01 {
    public static void main(String[] args) {
        int num = 1;
        int count = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            count += 2; // Increase the count by 2 for each row
        }
    }
}
