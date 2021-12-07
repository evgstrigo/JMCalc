package scanner;
import java.util.Scanner;
// небольшой класс для получения введённого с клавиатуры выражения


public class MyScanner {
    public static String getLineFromKeyboard() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите выражение для вычисления:");
            return scanner.nextLine();
        }
    }
}
