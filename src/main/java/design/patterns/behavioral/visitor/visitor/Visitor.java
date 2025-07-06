package design.patterns.behavioral.visitor.visitor;

import design.patterns.behavioral.visitor.element.DirectoryElement;
import design.patterns.behavioral.visitor.element.FileElement;

public interface Visitor {
    void visit(FileElement file);
    void visit(DirectoryElement directory);
}