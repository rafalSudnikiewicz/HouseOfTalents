import java.util.InputMismatchException;

public class Rownoleglobok { //Treść zadania na końcu pliku
    private static final int MAX = 100;
    private static final char FILLED = '*';
    private static final char BLANK = ' ';
    private static final int PARAM_OF_WIDTH = 0;
    private static final int PARAM_OF_HEIGHT = 1;
    private static final int PARAM_OF_KICK = 2;

    public static void main(String[] args) {


        int width;
        int height;
        int kick;

        try {
            width = Integer.parseInt(args[PARAM_OF_WIDTH]);
            height = Integer.parseInt(args[PARAM_OF_HEIGHT]);
            kick = Integer.parseInt(args[PARAM_OF_KICK]);
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

// Narysuj (wypisz) na standardowym wyjściu równoległobok z gwiazdek.
// Program powinien przyjmować jako parametry z command line oddzielone spacjami
// kolejno następujące wartości:
// szerokość równoległoboku (bok a)
// wysokość równoległoboku (bok b)
// "kopnięcie"
// Wymagania dodatkowe:
// * każdy z boków powinien mieć długość większą od zera, nie większą od 100
// * "kopnięcie" może przyjmować wartości od -100 do 100 włącznie
// * w przypadku błędnych danych wejściowych program nie powinien nic wypisywać na standardowym wyjściu. Nic.
// * program zawsze powinien zakończyć się z kodem 0
// * czas działania programu nie powinien przekraczać 30 sekund. Jeśli program będzie wykonywał się dłużej
// niż 30 sekund, zostanie przerwany przez system sprawdzający i nie będzie punktu za ten przypadek testowy
// * ostatni wiersz zawierający znaki rozwiązania powinien kończyć się znakiem przejścia do kolejnej linii
// i to powinien być ostatni znak wypisywany przez program
// dla: 5 5 2
// *****
//  *****
//    *****
//      *****
//        *****

// dla: 5 5 -2
//        *****
//      *****
//    *****
//  *****
//*****