package design.patterns.structural.flyweight;

public class Tree {
    private final int x;
    private final int y;
    private final TreeType type; // Flyweight

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y);
    }
}
