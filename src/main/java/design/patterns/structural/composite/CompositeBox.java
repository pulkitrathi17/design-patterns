package design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// composite component class
// https://www.youtube.com/watch?v=oo9AsGqnisk&list=RDCMUCXRZyv0cNwba6f0xCREAD_Q&index=11
// when we need to recursively apply a func on tree like structure of complex objects

public class CompositeBox implements Box {
  List<Box> childrenBox = new ArrayList<>();
  CompositeBox(Box... boxes){
    childrenBox.addAll(Arrays.asList(boxes));
  }

  @Override
  public int calculatePrice() {
    return childrenBox.stream()
        .mapToInt(box -> box.calculatePrice())
        .sum();
  }
}
