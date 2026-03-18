class uc6 {

    // Letter O
    public static String[] getO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Letter P
    public static String[] getP() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Letter S
    public static String[] getS() {
        return new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }

    public static void printOOPS() {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        // Loop through 7 lines
        for (int i = 0; i < 7; i++) {
            System.out.println(
                o[i] + " " +
                o[i] + " " +
                p[i] + " " +
                s[i]
            );
        }
    }
}

public class Main {
    public static void main(String[] args) {

        UC6.printOOPS();
    }
}