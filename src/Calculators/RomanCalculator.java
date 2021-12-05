package Calculators;
import NumberTypeExpressions.RomanNumbersExpression;


public class RomanCalculator {

        public static String convertFromRomanToArabic(String s) {
            int result = 0;

            s=s.replaceAll("IV", "4 ");
            s=s.replaceAll("IX", "9 ");
            s=s.replaceAll("I", "1 ");
            s=s.replaceAll("V", "5 ");
            s=s.replaceAll("X", "10 ");

            String [] sa = s.split(" ");
            for(String str : sa) {
                result +=Integer.parseInt(str);
            }
            return String.valueOf(result);
        }

        public void calculate(RomanNumbersExpression e) {
            int num1 = Integer.parseInt(convertFromRomanToArabic(e.getFirstElement()));
            int num2 = Integer.parseInt(convertFromRomanToArabic(e.getSecondElement()));
            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                System.out.println("Подсчёт не удался. Введенны числа не из диапазона 1-10");
                return;
            }
            switch (e.getMathOperationEnum()) {
                case PLUS:
                    System.out.println(num1 + num2);
                    break;
                case MINUS:
                    System.out.println(num1 - num2);
                    break;
                case MULTIPLE:
                    System.out.println(num1 * num2);
                    break;
                case DIVISION:
                    System.out.println(num1 / num2);
                    break;
                default: System.out.println("Подсчёт не удался по неведомым причинам");
            }
        }

}
