class uc4 {

    public static void printOOPS() {

        // Array storing all lines of banner
        String[] uc4 = {
            String.join("", " *****   *****   *****   ***** "),
            String.join("", "*     * *     * *     * *     *"),
            String.join("", "*     * *     * *     * *      "),
            String.join("", "*     * *     * *****    ***** "),
            String.join("", "*     * *     * *              "),
            String.join("", "*     * *     * *       *     *"),
            String.join("", " *****   *****   *        ***** ")
        };

        // Loop to print each line
        for (String line : uc4) {
            System.out.println(line);
        }
    }
}


    public static void main(String[] args) {

        // Call UC4 method
        uc4.printOOPS();
    }
