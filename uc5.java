class uc5 {

    public static void printOOPS() {

        // Array declaration + initialization together
        String[] uc5 = {
            String.join("", " *****   *****   *****   ***** "),
            String.join("", "*     * *     * *     * *     *"),
            String.join("", "*     * *     * *     * *      "),
            String.join("", "*     * *     * *****    ***** "),
            String.join("", "*     * *     * *              "),
            String.join("", "*     * *     * *       *     *"),
            String.join("", " *****   *****   *        ***** ")
        };

        // Enhanced for-loop
        for (String line : uc5) {
            System.out.println(line);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        UC5.printOOPS();
    }
}