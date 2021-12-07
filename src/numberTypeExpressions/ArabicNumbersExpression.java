package numberTypeExpressions;
import enums.MathOperationTypeEnum;
// Класс-наследник, содержащий в себе информацию о выражении с арабскими символами


public class ArabicNumbersExpression extends AbstractExpression {

    public ArabicNumbersExpression(
            String firstElement, String secondElement,
            MathOperationTypeEnum mathOperationEnum) {
        super(firstElement, secondElement, mathOperationEnum);
    }


}
