package design.patterns.behavioral.visitor;

/*
The Visitor Pattern allows you to add new operations to existing object structures without modifying their classes.
It separates algorithms from the objects on which they operate. This uses "double-dispatch" technique.

When you have:
    - A complex object structure (trees, AST, file system, composites).
    - Many unrelated operations on these objects.
    - You frequently need to add new operations but don’t want to modify object classes repeatedly.

Key Participants:
    - Visitor Interface : Declares visit methods for each concrete element type.
    - ConcreteVisitor   : Implements operations for each element.
    - Element Interface : Declares accept(Visitor visitor) method.
    - ConcreteElements  : Implement accept to call visitor.visit(this).
    - Client            : Creates visitors and elements and makes elements accept visitors.


UML(Unified Modeling Language):

     +-----------------+                  +------------------+
     |    Visitor      | <--------------- |  ConcreteVisitor |
     +-----------------+                  +------------------+
     |+visit(ElementA) |                  | +visit(ElementA) |
     |+visit(ElementB) |                  | +visit(ElementB) |
     +-----------------+                  +------------------+
             ^
             |
     +-----------------+         accept(visitor)
     |    Element      | <----------------+
     +-----------------+                  |
     |+accept(Visitor) |                  |
     +-----------------+                  |
       ^               ^                  |
       |               |                  |
+-------------+   +-------------+         |
| ElementA    |   | ElementB    |         |
+-------------+   +-------------+         |
|+accept()    |   |+accept()    |         |
+-------------+   +-------------+         |
       +----------------------------------+

*/

import design.patterns.behavioral.visitor.element.DirectoryElement;
import design.patterns.behavioral.visitor.element.Element;
import design.patterns.behavioral.visitor.element.FileElement;
import design.patterns.behavioral.visitor.visitor.SizeAndDirectoryCounterVisitor;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileElement file1 = new FileElement("file1.txt", 100);
        FileElement file2 = new FileElement("file2.txt", 200);
        DirectoryElement dir1 = new DirectoryElement("Documents");
        DirectoryElement dir2 = new DirectoryElement("Photos");

        List<Element> elements = List.of(file1, file2, dir1, dir2);

        SizeAndDirectoryCounterVisitor visitor = new SizeAndDirectoryCounterVisitor();

        for (Element element : elements) {
            element.accept(visitor);
        }

        System.out.println("Total file size: " + visitor.getTotalFileSize());
        System.out.println("Total directories: " + visitor.getDirectoryCount());
    }
}
