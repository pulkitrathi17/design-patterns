package design.patterns.behavioral.interpreter.expression.nonterminalexpression;

import design.patterns.behavioral.interpreter.expression.Expression;

public class AndExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret() {
        return left.interpret() && right.interpret();
    }
}