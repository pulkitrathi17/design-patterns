package design.patterns.behavioral.memento;

import lombok.*;

@Getter
@Setter
public class TextArea {

    private String text;
    public Memento takeSnapshot() {
        return new Memento(text);
    }

    public void restoreSnapshot(Memento memento) {
        text = memento.getText();
    }

    /*
        The major reason of making an inner class static is:
        - It prevents the inner object from holding an implicit reference to the outer object that created it,
        allowing the outer object to be garbage collected even if the inner object is still referenced elsewhere

        The major reason of making an inner class with private constructor is:
        - Encapsulation is preserved as only originator can create Memento instances and prevents accidental misuse by clients.
    */
    @Getter
    public static class Memento {
        private final String text;
        private Memento(String  text) {
            this.text = text;
        }
    }
}