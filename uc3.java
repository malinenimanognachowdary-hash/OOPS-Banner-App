class uc3 {

    // Static method using String.join()
    public static void printOOPS() {

        System.out.println(String.join("",
                " *****   *****   *****   ***** "));

        System.out.println(String.join("",
                "*     * *     * *     * *     *"));

        System.out.println(String.join("",
                "*     * *     * *     * *      "));

        System.out.println(String.join("",
                "*     * *     * *****    ***** "));

        System.out.println(String.join("",
                "*     * *     * *              "));

        System.out.println(String.join("",
                "*     * *     * *       *     *"));

        System.out.println(String.join("",
                " *****   *****   *        ***** "));
    }
}

    public static void main(String[] args) {

        // Calling static method (no object needed)
        uc3.printOOPS();
    }
