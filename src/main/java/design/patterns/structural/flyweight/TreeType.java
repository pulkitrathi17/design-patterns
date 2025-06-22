package design.patterns.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TreeType {
    private final String name;
    private final String color;
    private final String texture;

    public void draw(int x, int y) {
        System.out.println("Drawing " + name + " tree at (" + x + "," + y + ") with color " + color);
    }
}
