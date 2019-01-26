public class Szachownica {
    private static final int MAX = 15;
    private static final int PARAMOFTILEWIDTH = 0;
    private static final int PARAMOFTILEHEIGHT = 1;
    private static final int PARAMOFHORIZONTALTILES = 2;
    private static final int PARAMOFVERTICALTILES = 3;
    private static final int PARAMOFWHITECHAR = 4;
    private static final int PARAMOFBLACKCHAR = 5;



    public static void main(String[] args) {


        int widthOfTile;
        int heightOfTile;
        int tilesHorizontal;
        int tilesVertical;
        String white;
        String black;

        try {
            widthOfTile = Integer.parseInt(args[PARAMOFTILEWIDTH]);
            heightOfTile = Integer.parseInt(args[PARAMOFTILEHEIGHT]);
            tilesHorizontal = Integer.parseInt(args[PARAMOFHORIZONTALTILES]);
            tilesVertical = Integer.parseInt(args[PARAMOFVERTICALTILES]);

            white = args[PARAMOFWHITECHAR];
            black = args[PARAMOFBLACKCHAR];

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
