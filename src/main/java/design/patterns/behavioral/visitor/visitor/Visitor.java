package design.patterns.behavioral.visitor.visitor;

import design.patterns.behavioral.visitor.element.*;

public interface Visitor {
    void visit(FileElement file);
    void visit(DirectoryElement directory);
}