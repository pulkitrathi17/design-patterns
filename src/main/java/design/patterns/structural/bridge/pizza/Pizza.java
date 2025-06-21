package design.patterns.structural.bridge.pizza;

import lombok.Data;

@Data
public abstract class Pizza {
    public String topping;
    public String crust;

    public abstract void prepare();
}
