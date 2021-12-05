package Calculators;
import NumberTypeExpressions.AbstractExpression;
import NumberTypeExpressions.ArabicNumbersExpression;
import NumberTypeExpressions.RomanNumbersExpression;
// Класс, имеющий несколько перегруженных методов calculate для работы с ArabicExpression или RomanExpression

public class Calculator {


    // Метод вызывает корректный калькулятор в зависимости от типа выражения, указанного в параметрах этого метода.
    // На вход метода подаём любого наслдедника класса AbstractExpression
    public void calculate(AbstractExpression e) {

        // Если выражение является "арабским", то вызываем калькулятор для "арабских" выражений
        if (e instanceof ArabicNumbersExpression) {
            new ArabicCalculator().calculate((ArabicNumbersExpression) e);
        } else if (e instanceof RomanNumbersExpression ) {
            new RomanCalculator().calculate((RomanNumbersExpression) e);
        }
    }
}
