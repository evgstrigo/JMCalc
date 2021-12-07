package calculators;
import numberTypeExpressions.RomanNumbersExpression;
// Класс, содержащий логику вычисления для римских символов

public class RomanCalculator {

    // статический метод, который переводит римское число в арабское
    public static String convertFromRomanToArabic(String s) {
        int result = 0;

        s = s.replaceAll("IV", "4 ");
        s = s.replaceAll("IX", "9 ");
        s = s.replaceAll("I", "1 ");
        s = s.replaceAll("V", "5 ");
        s = s.replaceAll("X", "10 ");

        String[] arrayAfterSplitting = s.split(" ");
        for (String str : arrayAfterSplitting) {
            result += Integer.parseInt(str);
        }
        return String.valueOf(result);
    }

    // статический метод, собирающий в себя несколько методов, которые конвертируют
    // определенные "куски" числа из арабских в римские числа
    public static String convertFromArabicToRoman(int arabicNumber) {
        StringBuilder tempResultLine = new StringBuilder();
        int tempNumber = arabicNumber;
        tempNumber = addHundreds(tempNumber, tempResultLine);
        tempNumber = addFifties(tempNumber, tempResultLine);
        tempNumber = addTeens(tempNumber, tempResultLine);
        tempNumber = addFives(tempNumber, tempResultLine);
        tempNumber = addOnes(tempNumber, tempResultLine);
        return tempResultLine.toString();
    }


    public static int addHundreds(int b, StringBuilder sb) {

        if (b < 90) {
            return b;
        }


        if (b >= 90 && b < 100) {
            sb.append("XC");
            b = b - 90;
            return b;
        }

        int count = b / 100;
        if (count == 4) {
            sb.append("CD");
            b %= 100;
        } else if (count > 0 && count < 4) {
            for (int i = 0; i < count; i++) {
                sb.append("C");
                b %= 100;
            }
        }
        return b;
    }

    public static int addFifties(int b, StringBuilder sb) {

        if (b < 40) {
            return b;
        }


        if (b >= 40 && b < 50) {
            sb.append("XL");
            b -= 40;
            return b;
        }

        int count = b / 50;
        if (count == 1) {
            sb.append("L");
            b %= 50;
        }
        return b;
    }

    public static int addTeens(int b, StringBuilder sb) {

        if (b < 9) {
            return b;
        }

        int count = b / 10;
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                sb.append("X");
            }
            b %= 10;
        }
        if (b == 9) {
            sb.append("IX");
            b = b - 9;
            return b;
        }

        return b;
    }

    public static int addFives(int b, StringBuilder sb) {

        if (b < 4) {
            return b;
        }

        if (b == 4) {
            sb.append("IV");
            b = b - 4;
            return b;
        }

        int count = b / 5;
        if (count > 0) {
            sb.append("V");
            b %= 5;
        }
        return b;
    }

    public static int addOnes(int b, StringBuilder sb) {

        for (int i = 0; i < b; i++) {
            sb.append("I");
        }
        return 0;
    }


    /* метод-калькулятор для римских чисел
    сперва каждое число конвертируем из римского в арабское
    производим вычислении и получаем результат в арабских числах
    конвертируем результат из арабских в римские числа и выводим на экран
    заодно проверяем введенные числа на диапазон 1-10
    */
    public void calculate(RomanNumbersExpression e) throws Exception {
        int num1 = Integer.parseInt(convertFromRomanToArabic(e.getFirstElement()));
        int num2 = Integer.parseInt(convertFromRomanToArabic(e.getSecondElement()));
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            System.out.println("Подсчёт не удался. Введенны числа не из диапазона 1-10");
            return;
        }
        int result = 0;
        switch (e.getMathOperationEnum()) {
            case PLUS:
                result = num1 + num2;
                break;
            case MINUS:
                result = num1 - num2;
                break;
            case MULTIPLE:
                result = num1 * num2;
                break;
            case DIVISION:
                result = num1 / num2;
                break;
            default:
                System.out.println("Подсчёт не удался по неведомым причинам");
        }

        if (result < 1) {
            throw new Exception("Результат вычисления меньше 1");
        }

        String resultString = convertFromArabicToRoman(result);
        System.out.println("Результат = " +resultString);
    }

}
