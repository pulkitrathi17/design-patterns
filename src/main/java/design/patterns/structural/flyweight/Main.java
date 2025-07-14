package design.patterns.structural.flyweight;

/*
The Flyweight Pattern is a structural design pattern used to minimize memory usage by
sharing common parts of objects that are repeated many times.

It separates the object state into:
 - Intrinsic state: Shared, reusable, constant data
 - Extrinsic state: Varies per object, passed in from the outside
*/

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        for (int i = 0; i < 100000; i++) {
            forest.plantTree(i, i, "Pine", "Green", "pine-texture.png");
        }

        for (int i = 0; i < 100000; i++) {
            forest.plantTree(i, i, "Oak", "DarkGreen", "oak-texture.png");
        }

        forest.draw();
    }
}
