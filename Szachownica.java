public class Szachownica {
    private static final int MAX = 15;

    public static void main(String[] args) {


        int widthOfTile;
        int heightOfTile;
        int tilesHorizontal;
        int tilesVertical;
        String white;
        String black;

        try {
            widthOfTile = Integer.parseInt(args[0]);
            heightOfTile = Integer.parseInt(args[1]);
            tilesHorizontal = Integer.parseInt(args[2]);
            tilesVertical = Integer.parseInt(args[3]);

            white = args[4];
            black = args[5];

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return;
        }

        if (heightOfTile < 0 || heightOfTile > MAX ||
                widthOfTile < 0 || widthOfTile > MAX ||
                tilesHorizontal < 0 || tilesHorizontal > MAX ||
                tilesVertical < 0 || tilesVertical > MAX ||
                white.length() != 1 || black.length() != 1) {
            return;
        }


        for (int i = 0; i < heightOfTile * tilesVertical; i++) {
            for (int j = 0; j < widthOfTile * tilesHorizontal; j++) {
                if (((i / heightOfTile) % 2 == 0 && (j / widthOfTile) % 2 == 0) ||
                        ((i / heightOfTile) % 2 == 1 && (j / widthOfTile) % 2 == 1)) {
                    System.out.print(white);
                } else System.out.print(black);
            }
            System.out.println();
        }
    }
}
