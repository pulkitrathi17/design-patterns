package design.patterns.behavioral.interpreter.expression.terminalexpression;

import design.patterns.behavioral.interpreter.expression.*;

public class BooleanExpression implements Expression {
    private final boolean value;

    public BooleanExpression(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret() {
        return value;
    }
}