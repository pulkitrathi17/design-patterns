package design.patterns.behavioral.interpreter;

/*
- The Interpreter Pattern defines a grammar for a language and provides an interpreter to evaluate sentences in that language.
- Used to interpret sentences in a language (usually small, domain-specific languages).
- Each rule in the grammar is represented by a class.

When to use Interpreter Pattern?
    - You have a language to interpret (e.g., regex, expressions, filters).
    - Grammar is simple and stable.

Structure:
    - AbstractExpression    : Interface for interpreting expressions.
    - TerminalExpression    : Represents atomic elements in the grammar.
    - NonTerminalExpression : Represents composite rules (e.g., AND, OR, operations).
    - Context               : Contains information for the interpreter to interpret.
    - Client                : Builds the expression tree representing the grammar.

UML:
+------------------+           +------------------------+
| Context          |<----------| AbstractExpression     |
+------------------+           +------------------------+
                               ^             ^
                               |             |
                   +----------------+   +----------------+
                   | TerminalExpr   |   | NonTerminalExpr|
                   +----------------+   +----------------+

*/

import design.patterns.behavioral.interpreter.expression.*;
import design.patterns.behavioral.interpreter.expression.nonterminalexpression.*;
import design.patterns.behavioral.interpreter.expression.terminalexpression.*;

public class Main {
    public static void main(String[] args) {
        Expression trueValue = new BooleanExpression(true);
        Expression falseValue = new BooleanExpression(false);

        Expression andExpr = new AndExpression(trueValue, falseValue);
        Expression orExpr = new OrExpression(trueValue, falseValue);
        Expression notExpr = new NotExpression(trueValue);

        System.out.println("true AND false = " + andExpr.interpret());
        System.out.println("true OR false = " + orExpr.interpret());
        System.out.println("NOT true = " + notExpr.interpret());
    }
}