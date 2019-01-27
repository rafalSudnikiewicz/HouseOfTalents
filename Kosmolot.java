public class Kosmolot {
    private static final int MAX = 75;
    private static final int PARAMOFSIZE = 0;
    private static final int PARAMOFTSHIELD = 1;
    private static final char FILLED = '*';
    private static final char BLANK = ' ';
    private static final char ENGINEORHEAD = '>';
    private static final char LEFTSHIELD = '\\';
    private static final char RIGTHSHIELD = '/';

    public static void main(String[] args) {

        int size;
        boolean shieldsOn;

        try {
            size = Integer.parseInt(args[PARAMOFSIZE]);
            if (args[PARAMOFTSHIELD].equals("Y")) {
                shieldsOn = true;
            } else if (args[PARAMOFTSHIELD].equals("N")) {
                shieldsOn = false;
            } else return;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return;
        }

        if (size < 1 || size > MAX) {
            return;
        }

        printRocket(size, shieldsOn);


    }

    private static void printRocket(int size, boolean shieldsOn) {
        for (int i = 0; i < 2 * size - 1; i++) {
            for (int j = 0; j < size * size; j++) {
                if ((j % size <= i && i < size) || (j % size < size - i % size - 1 && i >= size)) {

                    if ((j == 0 || (i == size - 1 && j == size * size - 1)) && shieldsOn) {
                        System.out.print(ENGINEORHEAD);
                    } else if (j % size == i && i < size - 1 && shieldsOn) {
                        System.out.print(LEFTSHIELD);
                    } else if (j % size == size - i % size - 2 && i >= size && shieldsOn) {
                        System.out.print(RIGTHSHIELD);
                    } else System.out.print(FILLED);
                } else System.out.print(BLANK);

            }
            System.out.println();
        }
    }
}
