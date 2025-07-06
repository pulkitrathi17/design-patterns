package design.patterns.behavioral.visitor.element;

import design.patterns.behavioral.visitor.visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}