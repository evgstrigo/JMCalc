package Scanner;

import java.util.Scanner;

public class MyScanner {
    public static String getLineFromKeyboard() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите выражение для вычисления:");
            return scanner.nextLine();
        }
    }
}
