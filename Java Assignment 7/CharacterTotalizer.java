//Write a class that keeps a running total of all characters passed to it (one at a time) and throws anexception if it is passed a non-alphabetic character. 


class NonAlphabeticCharacterException extends Exception {
    public NonAlphabeticCharacterException(String message) {
        super(message);
    }
}

public class CharacterTotalizer {
    private int total;

    public CharacterTotalizer() {
        this.total = 0;
    }

    public void addCharacter(char ch) throws NonAlphabeticCharacterException {
        if (Character.isLetter(ch)) {
            total += Character.toLowerCase(ch) - 'a' + 1; // Converting character to lowercase and calculating its position in the alphabet
        } else {
            throw new NonAlphabeticCharacterException("Non-alphabetic character detected: " + ch);
        }
    }

    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        CharacterTotalizer totalizer = new CharacterTotalizer();
        String input = "Hello World 123";

        for (char ch : input.toCharArray()) {
            try {
                totalizer.addCharacter(ch);
            } catch (NonAlphabeticCharacterException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Total of alphabetic characters: " + totalizer.getTotal());
    }
}
