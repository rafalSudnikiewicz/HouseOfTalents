import java.util.InputMismatchException;

public class Rownoleglobok {
    private static final int MAX = 100;
    private static final char FILLED = '*';
    private static final char BLANK = ' ';
    private static final int PARAMOFWIDTH = 0;
    private static final int PARAMOFHEIGHT = 1;
    private static final int PARAMOFKICK = 2;

    public static void main(String[] args) {


        int width;
        int height;
        int kick;

        try {
            width = Integer.parseInt(args[PARAMOFWIDTH]);
            height = Integer.parseInt(args[PARAMOFHEIGHT]);
            kick = Integer.parseInt(args[PARAMOFKICK]);
        } catch (InputMismatchException | NumberFormatException e) {
            return;
        }

        if (height < 0 || Math.sqrt((double) height * height + kick * kick) > MAX ||
                width < 0 || width > MAX ||
                kick < -MAX || kick > MAX) {
            return;
        }

        if (kick > 0) {
            draw(width, height, kick, 0);
        } else {
            draw(width, height, kick, -kick * (height - 1));
        }

    }

    public static void draw(int width, int height, int kick, int beginOfDraw) {
        for (int i = 0; i < height; i++) {
            int length = 0;
            for (int j = 0; j < width + Math.abs(kick) * (height - 1); j++) {
                if (length < width && j > beginOfDraw + kick * i - 1) {
                    System.out.print(FILLED);
                    length++;
                } else System.out.print(BLANK);
            }
            System.out.println();
        }
    }
}
