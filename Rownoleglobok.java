import java.util.InputMismatchException;
import java.util.Scanner;

public class Rownoleglobok {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = 1000;
        int height = 1000;
        int kick = 1000;

        try {
            width = scan.nextInt();
            height = scan.nextInt();
            kick = scan.nextInt();
        } catch (InputMismatchException e) {
        }

        if (height > 0 && Math.sqrt((double) height * height + kick * kick) <= 100 &&
                width > 0 && width <= 100 &&
                kick >= -100 && kick <= 100) {

            if (kick > 0) {
                for (int i = 0; i < height; i++) {
                    int length = 0;
                    for (int j = 0; j < (width + Math.abs(kick * (height-1))); j++) {
                        if (length < width && j > kick * i - 1) {
                            System.out.print("*");
                            length++;
                        } else System.out.print(" ");
                    }
                    System.out.println();
                }
            } else {
                for (int i = 0; i < height; i++) {
                    int length = 0;
                    for (int j = 0; j < (width + Math.abs(kick * (height-1))); j++) {
                        if (length < width && j > -kick * (height - 1) + kick * i - 1) {
                            System.out.print("*");
                            length++;
                        } else System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
