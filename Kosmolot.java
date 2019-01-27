public class Kosmolot {//Treść zadania na końcu pliku
    private static final int MAX = 75;
    private static final int PARAM_OF_SIZE = 0;
    private static final int PARAM_OF_SHIELD = 1;
    private static final char FILLED = '*';
    private static final char BLANK = ' ';
    private static final char ENGINE_OR_HEAD = '>';
    private static final char LEFT_SHIELD = '\\';
    private static final char RIGHT_SHIELD = '/';
    private static final char SHIELD_ON_SIGN = 'Y';
    private static final char SHIELD_OFF_SIGN = 'N';

    public static void main(String[] args) {

        int size;
        boolean shieldsOn;

        try {
            size = Integer.parseInt(args[PARAM_OF_SIZE]);
            switch (args[PARAM_OF_SHIELD].charAt(0)) {
                case SHIELD_ON_SIGN:
                    shieldsOn = true;
                    break;
                case SHIELD_OFF_SIGN:
                    shieldsOn = false;
                    break;
                default:
                    return;
            }
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
                        System.out.print(ENGINE_OR_HEAD);
                    } else if (j % size == i && i < size - 1 && shieldsOn) {
                        System.out.print(LEFT_SHIELD);
                    } else if (j % size == size - i % size - 2 && i >= size && shieldsOn) {
                        System.out.print(RIGHT_SHIELD);
                    } else System.out.print(FILLED);
                } else System.out.print(BLANK);

            }
            System.out.println();
        }
    }
}

//    Używając wskazanych poniżej znaków narysuj (wypisz) na standardowym wyjściu rakietę kosmiczną o rozmiarze n.
//        Program powinien przyjmować jako parametry z command line oddzielone spacjami kolejno następujące
// wartości:
//        rozmiar rakiety
//        shield_on)
//        Wymagania dodatkowe:
//        * rozmiar rakiety może przyjmować wartości numeryczne od 1 do 75
//        * shield_on może przyjmować wartości Y lub N (odpowiednio dla włączonego lub wyłączonego pancerza)
//        * w przypadku błędnych danych wejściowych (np. brak parametru, dwa znaki zamiast jednego, itp.)
// program nie powinien nic wypisywać na standardowym wyjściu. Nic.
//        * program zawsze powinien zakończyć się z kodem 0
//        * czas działania programu nie powinien przekraczać 30 sekund. Jeśli program będzie wykonywał się
// dłużej niż 30 sekund, zostanie przerwany przez system sprawdzający i nie będzie punktu za ten przypadek testowy
//        * ostatni wiersz zawierający znaki rozwiązania powinien kończyć się znakiem przejścia do kolejnej linii
// i to powinien być ostatni znak wypisywany przez program
