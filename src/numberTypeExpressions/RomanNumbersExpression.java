package numberTypeExpressions;
import enums.MathOperationTypeEnum;
// Класс-наследник, содержащий в себе информацию о выражении с римскими символами

public class RomanNumbersExpression extends AbstractExpression {
    public RomanNumbersExpression(
            String firstElement, String secondElement,
            MathOperationTypeEnum mathOperationEnum) {
        super(firstElement, secondElement, mathOperationEnum);
    }
}
