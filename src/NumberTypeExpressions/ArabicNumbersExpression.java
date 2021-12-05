package NumberTypeExpressions;// Класс-наследник, содержащий в себе информацию о выражении с арабскими символами

import Enums.MathOperationTypeEnum;
import NumberTypeExpressions.AbstractExpression;

public class ArabicNumbersExpression extends AbstractExpression {

    public ArabicNumbersExpression(
            String firstElement, String secondElement,
            MathOperationTypeEnum mathOperationEnum) {
        super(firstElement, secondElement, mathOperationEnum);
    }


}
