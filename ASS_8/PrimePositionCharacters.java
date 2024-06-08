import java.util.Scanner;

public class PrimePositionCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        System.out.println("Characters in prime positions:");
        for (int i = 2; i < input.length(); i++) {
            if (isPrime(i)) {
                System.out.print(input.charAt(i) + " ");
            }
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
