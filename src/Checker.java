// Класс с несколькими утилитными методами для работы со введённой строкой

import Enums.MathOperationTypeEnum;
import NumberTypeExpressions.AbstractExpression;
import NumberTypeExpressions.ArabicNumbersExpression;
import NumberTypeExpressions.RomanNumbersExpression;

public class Checker {

    // статический метод для определения математического знака в передаваемой строке
    public static MathOperationTypeEnum identifyMathSign(String s) throws Exception {
        if (s.contains("+")) {
            return MathOperationTypeEnum.PLUS;
        } else if (s.contains("-")) {
            return MathOperationTypeEnum.MINUS;
        } else if (s.contains("*")) {
            return MathOperationTypeEnum.MULTIPLE;
        } else if (s.contains("/")) {
            return MathOperationTypeEnum.DIVISION;
        } else throw new Exception("No correct math sign");
    }

    // статический метод, возвращающий объект-наследник класса AbstractExpression
    public static AbstractExpression getExpressionWithIdentifiedNumberSystemAndMathOperationType(String s) throws Exception {
        // определяем знак выражения и присваеваем его переменной типа MathOperationTypeEnum
        MathOperationTypeEnum mathOperationType = identifyMathSign(s);

        // на всякий случай убираем пробелы из выражения
        s = s.replaceAll(" ", "");

        // проверяем, нет ли дробных чисел в введенной строке
        if (s.contains(",") || s.contains(".")) {
            throw new Exception("Введенные числа должны быть целыми.");

        // проверяем на наличие арабских символов и в целом на соответствие необходимому выражению
        } else if (s.matches("\\d+[+*\\-/]\\d+")) {
            // делим строку одним из символов (+-*/) на массив из двух элементов (до и после знака)
            String[] array = s.split("[+*\\-/]");
            // создаём новый объект ArabicNumbersExpression, который будем класть в калькулятор
            return new ArabicNumbersExpression(array[0], array[1], mathOperationType);
        } else  {
            String[] array = s.split("[+*\\-/]");
            return new RomanNumbersExpression(array[0], array[1], mathOperationType);
        }
    }


}
