package Calculators;

import Enums.MathOperationTypeEnum;
import NumberTypeExpressions.ArabicNumbersExpression;
// Класс, содержащий логику вычисления для арабских символов

public class ArabicCalculator {

    public void calculate(ArabicNumbersExpression e) {
        int num1 = Integer.parseInt(e.getFirstElement());
        int num2 = Integer.parseInt(e.getSecondElement());
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
