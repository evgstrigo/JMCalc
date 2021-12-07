package calculators;

import numberTypeExpressions.ArabicNumbersExpression;
// Класс, содержащий логику вычисления для арабских символов

public class ArabicCalculator {
    // метод-калькулятор для арабских чисел
    // заодно проверяем введенные числа на диапазон 1-10
    public void calculate(ArabicNumbersExpression e) throws Exception {
        int num1 = Integer.parseInt(e.getFirstElement());
        int num2 = Integer.parseInt(e.getSecondElement());
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            System.out.println("Подсчёт не удался. Введенны числа не из диапазона 1-10");
            return;
        }
        int result = 0;
        switch (e.getMathOperationEnum()) {
            case PLUS:
                result = (num1 + num2);
                break;
            case MINUS:
                result = (num1 - num2);
                break;
            case MULTIPLE:
                result = (num1 * num2);
                break;
            case DIVISION:
                result = (num1 / num2);
                break;
            default: System.out.println("Подсчёт не удался по неведомым причинам");
        }
        System.out.println("Результат = " +result);

    }

}
