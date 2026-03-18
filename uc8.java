import java.util.HashMap;
import java.util.Map;

class uc8 {

    // Map storing character patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // Initialize patterns
    static {
        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });
    }

    // Function to render any word
    public static void renderWord(String word) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }

            System.out.println(line);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        uc8.renderWord("OOPS");
    }
}