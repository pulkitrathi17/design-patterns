package design.patterns.behavioral.visitor.element;

import design.patterns.behavioral.visitor.visitor.Visitor;

public class DirectoryElement implements Element {
    private final String name;

    public DirectoryElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}