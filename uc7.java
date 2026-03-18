import java.util.HashMap;
import java.util.Map;

class uc7 {

    // Inner class to store character pattern
    static class CharacterPattern {
        private String[] pattern;

        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Map to store all characters
    private static Map<Character, CharacterPattern> patternMap = new HashMap<>();

    // Static block to initialize patterns
    static {
        patternMap.put('O', new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        }));
    }

    public static void printWord(String word) {

        // Loop through 7 lines
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            // Loop through each character
            for (char ch : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[i]).append(" ");
                }
            }

            System.out.println(line);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        uc7.printWord("OOPS");
    }
}