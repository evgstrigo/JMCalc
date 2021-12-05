package NumberTypeExpressions;

import Enums.MathOperationTypeEnum;

public class RomanNumbersExpression extends AbstractExpression {
    public RomanNumbersExpression(
            String firstElement, String secondElement,
            MathOperationTypeEnum mathOperationEnum) {
        super(firstElement, secondElement, mathOperationEnum);
    }
}
