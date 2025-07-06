package design.patterns.behavioral.visitor.visitor;

import design.patterns.behavioral.visitor.element.DirectoryElement;
import design.patterns.behavioral.visitor.element.FileElement;

public class SizeAndDirectoryCounterVisitor implements Visitor {
    private int totalFileSize = 0;
    private int directoryCount = 0;

    @Override
    public void visit(FileElement file) {
        System.out.println("Visiting file: " + file.getName() + ", size: " + file.getSize());
        totalFileSize += file.getSize();
    }

    @Override
    public void visit(DirectoryElement directory) {
        System.out.println("Visiting directory: " + directory.getName());
        directoryCount++;
    }

    public int getTotalFileSize() {
        return totalFileSize;
    }

    public int getDirectoryCount() {
        return directoryCount;
    }
}