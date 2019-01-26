import java.util.InputMismatchException;
import java.util.Scanner;

public class Rownoleglobok {
    private static final int MAX = 100;
    private static final char FILLED = '*';
    private static final char BLANK = ' ';


    public static void main(String[] args) {


        int width;
        int height;
        int kick;

        try {
            width = Integer.parseInt(args[0]);
            height = Integer.parseInt(args[1]);
            kick = Integer.parseInt(args[2]);
        } catch (InputMismatchException | NumberFormatException e) {
            return;
        }

        if (height < 0 || Math.sqrt((double) height * height + kick * kick) > MAX ||
                width < 0 || width > MAX ||
                kick < -MAX || kick > MAX) {
            return;
        }

        if (kick > 0) {
            drawKickedLeft(width, height, kick);
        } else {
            drawKickedRight(width, height, kick);
        }

    }

    public static void drawKickedLeft(int width, int height, int kick) {
        for (int i = 0; i < height; i++) {
            int length = 0;
            for (int j = 0; j < width + kick * (height - 1); j++) {
                if (length < width && j > kick * i - 1) {
                    System.out.print(FILLED);
                    length++;
                } else System.out.print(BLANK);
            }
            System.out.println();
        }
    }

    public static void drawKickedRight(int width, int height, int kick) {
        for (int i = 0; i < height; i++) {
            int length = 0;
            for (int j = 0; j < width - kick * (height - 1); j++) {
                if (length < width && j > -kick * (height - 1) + kick * i - 1) {
                    System.out.print(FILLED);
                    length++;
                } else System.out.print(BLANK);
            }
            System.out.println();
        }
    }
}
