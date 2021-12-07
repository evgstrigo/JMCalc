package calculators;
import numberTypeExpressions.AbstractExpression;
import numberTypeExpressions.ArabicNumbersExpression;
import numberTypeExpressions.RomanNumbersExpression;
// Класс, имеющий несколько перегруженных методов calculate для работы с ArabicExpression или RomanExpression

public class Calculator {

    // Метод вызывает корректный калькулятор в зависимости от типа выражения, указанного в параметрах этого метода.
    // На вход метода подаём любого наслдедника класса AbstractExpression
    public void calculate(AbstractExpression e) throws Exception {

        // Если выражение является "АРАБСКИМ", то вызываем калькулятор для "арабских" выражений
        if (e instanceof ArabicNumbersExpression) {
            new ArabicCalculator().calculate((ArabicNumbersExpression) e);

        // Если выражение является "РИМСКИМ", то вызываем калькулятор для "римских" выражений
        } else if (e instanceof RomanNumbersExpression ) {
            new RomanCalculator().calculate((RomanNumbersExpression) e);
        }
    }
}
