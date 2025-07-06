package design.patterns.behavioral.interpreter.expression.nonterminalexpression;

import design.patterns.behavioral.interpreter.expression.*;

public class NotExpression implements Expression {
    private final Expression expr;

    public NotExpression(Expression expr) {
        this.expr = expr;
    }

    @Override
    public boolean interpret() {
        return !expr.interpret();
    }
}