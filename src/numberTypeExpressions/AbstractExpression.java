package numberTypeExpressions;
// Абстрактный класс, содержащий в себе следующую информацию информацию о выражении:
// 1) Первый элемент   2) Второй элемент    3) Знак математического действия


import enums.MathOperationTypeEnum;

public abstract class AbstractExpression {

    private String firstElement;
    private String secondElement;
    private MathOperationTypeEnum mathOperationEnum;

    public AbstractExpression(
            String firstElement, String secondElement,
            MathOperationTypeEnum mathOperationEnum) {
        if (firstElement == null || secondElement == null || mathOperationEnum == null) {
            throw new NullPointerException("Объект AbstractExpression не может быть создан ");
        }
        this.firstElement = firstElement;
        this.secondElement = secondElement;
        this.mathOperationEnum = mathOperationEnum;
    }

    public String getFirstElement() {
        return firstElement;
    }

    public String getSecondElement() {
        return secondElement;
    }

    public MathOperationTypeEnum getMathOperationEnum() {
        return mathOperationEnum;
    }
}
