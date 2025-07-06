package design.patterns.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WrongTextArea {
    private String text;
    public WrongMemento takeSnapshot() {
    /*
         We are passing "this" here which means our Memento object stores a reference to the same TextArea object
         When we modify the TextArea next time, it changes the text field of the same object stored inside the memento.
         The memento holds a reference to the same TextArea instead of storing the text value at that point in time.
         Root Cause: Shallow Copy (Reference Sharing)
    */
        return new WrongMemento(this);
    }

    public void restoreSnapshot(WrongMemento wrongMemento) {
        text = wrongMemento.wrongTextArea.getText();
    }

    @Getter
    public static class WrongMemento {
        private final WrongTextArea wrongTextArea;
        private WrongMemento(WrongTextArea  wrongTextArea) {
            this.wrongTextArea = wrongTextArea;
        }
    }
}
