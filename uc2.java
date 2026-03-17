class uc2 {

    // Method to print OOPS banner
    void printOOPS() {
        System.out.println(" *****   *****   *****   ***** ");
        System.out.println("*     * *     * *     * *     *");
        System.out.println("*     * *     * *     * *      ");
        System.out.println("*     * *     * *****    ***** ");
        System.out.println("*     * *     * *              ");
        System.out.println("*     * *     * *       *     *");
        System.out.println(" *****   *****   *        ***** ");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of Banner class
        Banner banner = new Banner();

        // Call method
        banner.printOOPS();
    }
}