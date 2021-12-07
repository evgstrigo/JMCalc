package checker;

import enums.MathOperationTypeEnum;
import numberTypeExpressions.AbstractExpression;
import numberTypeExpressions.ArabicNumbersExpression;
import numberTypeExpressions.RomanNumbersExpression;
// Класс с несколькими утилитными методами для работы со введённой строкой

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
        } else throw new Exception("Допустимый математический знак не обнаружен");
    }

    // статический метод, возвращающий объект-наследник класса AbstractExpression
    // для дальнейшего помещения его в калькулятор.
    public static AbstractExpression getExpressionWithIdentifiedNumberSystemAndMathOperationType(String str) throws Exception {
        // определяем знак выражения и присваиваем его переменной типа MathOperationTypeEnum
        MathOperationTypeEnum mathOperationType = identifyMathSign(str);

        // на всякий случай убираем пробелы из выражения
        str = str.replaceAll(" ", "");

        // проверяем, нет ли дробных чисел в введенной строке
        if (str.contains(",") || str.contains(".")) {
            throw new Exception("Введенные числа должны быть целыми.");
        }


        // создаём массив для наших будущих элементов (до и после знака)
        String[] arrayOfSplittedLine;

        // проверяем на наличие АРАБСКИХ символов и в целом на соответствие необходимому выражению
        if (str.matches("\\d+[+*\\-/]\\d+")) {

            // делим строку одним из символов (+-*/) и помещаем в наш вышесозданный массив
            arrayOfSplittedLine = str.split("[+*\\-/]");

            // создаём новый объект ArabicNumbersExpression, который будем класть в калькулятор
            return new ArabicNumbersExpression(arrayOfSplittedLine[0], arrayOfSplittedLine[1], mathOperationType);
        }

            // проверяем на наличие РИМСКИХ символов и в целом на соответствие необходимому выражению
        else if (str.matches("[IVX]+[+*\\-/][IVX]+")) {

            // делим строку одним из символов (+-*/) и помещаем в наш вышесозданный массив
            arrayOfSplittedLine = str.split("[+*\\-/]");

            // создаём новый объект RomanNumbersExpression, который будем класть в калькулятор
            return new RomanNumbersExpression(arrayOfSplittedLine[0], arrayOfSplittedLine[1], mathOperationType);

        // если выражение не подпадает под заданные условия, бросаем исключение
        } else {

            throw new Exception("Введённая строка не соответствует требованиям условия");
        }
    }


}
