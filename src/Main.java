import calculators.Calculator;
import checker.Checker;
import numberTypeExpressions.AbstractExpression;
import scanner.MyScanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String enteredFromKeyboardLine = MyScanner.getLineFromKeyboard();

        AbstractExpression expression =
                Checker.getExpressionWithIdentifiedNumberSystemAndMathOperationType(enteredFromKeyboardLine);

        Calculator myCalc = new Calculator();
        myCalc.calculate(expression);
    }
}
