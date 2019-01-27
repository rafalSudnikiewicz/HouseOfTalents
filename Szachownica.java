public class Szachownica { //Treść zadania na końcu pliku
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

// Narysuj (wypisz) na standardowym wyjściu szachownicę z gwiazdek.
// Program powinien przyjmować jako parametry z command line oddzielone spacjami kolejno następujące wartości:
// szerokość kafelka
// wysokość kafelka
// liczba kafelków w poziomie
// liczba kafelków w pionie
// znak kafelka "białego" (pojedynczy)
// znak kafelka "czarnego" (pojedynczy)
// Wymagania dodatkowe:
// * program zawsze powinien zakończyć się z kodem 0, nawet jeśli parametry są błędne (np. brak parametru,
// dwa znaki zamiast jednego, itp.)
// * liczby mniejsze niż 1 lub większe niż 15 są niepoprawne
// * w przypadku błędnych danych wejściowych program nie powinien nic wypisywać na standardowym wyjściu. Nic.
// * kafelek "biały" powinien zawsze znajdować się w lewym górnym rogu
// * czas działania programu nie powinien przekraczać 30 sekund. Jeśli program będzie wykonywał się dłużej
// niż 30 sekund, zostanie przerwany przez system sprawdzający i nie będzie punktu za ten przypadek testowy
// * ostatni wiersz zawierający znaki rozwiązania powinien kończyć się znakiem przejścia do kolejnej linii
// i to powinien być ostatni znak wypisywany przez program
// * plik z programem powinien nazywać się Szachownica.java
// dla 2 3 4 5  x .
//        xx..xx..
//        xx..xx..
//        xx..xx..
//        ..xx..xx
//        ..xx..xx
//        ..xx..xx
//        xx..xx..
//        xx..xx..
//        xx..xx..
//        ..xx..xx
//        ..xx..xx
//        ..xx..xx
//        xx..xx..
//        xx..xx..
//        xx..xx..











