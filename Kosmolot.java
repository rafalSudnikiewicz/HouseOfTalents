public class Kosmolot {
    private static final int MAX = 75;
    private static final int PARAMOFSIZE = 0;
    private static final int PARAMOFTSHIELD = 1;
    private static final char FILLED = '*';
    private static final char BLANK = ' ';


    public static void main(String[] args) {


        int size;
        boolean shieldsOn;


        try {
            size = Integer.parseInt(args[PARAMOFSIZE]);
            if (args[PARAMOFTSHIELD].toUpperCase().equals("Y")) shieldsOn = true;
            if (args[PARAMOFTSHIELD].toUpperCase().equals("N")) shieldsOn = false;
            else return;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return;
        }

        if (size < 1 || size > MAX) {
            return;
        }

        if (shieldsOn) {
            printRocketWithShield(size);
        } else printRocketWithoutShield(size);


    }

    private static void printRocketWithShield(int size) {
//        for (int i = 0; i < 2 * size - 1; i++) {
//            for (int j = 0; j < size * size; j++) {
//                if ((j % size <= i && i < size) || (j % size < size - i % size - 1 && i >= size)) {
//                    System.out.print(FILLED);
//                } else System.out.print(BLANK);
//
//            }
//            System.out.println();
//        }
    }

    private static void printRocketWithoutShield(int size) {
        for (int i = 0; i < 2 * size - 1; i++) {
            for (int j = 0; j < size * size; j++) {
                if ((j % size <= i && i < size) || (j % size < size - i % size - 1 && i >= size)) {
                    System.out.print(FILLED);
                } else System.out.print(BLANK);

            }
            System.out.println();
        }
    }
}
