package design.patterns.behavioral.memento;


/*
The Memento Pattern is a behavioral design pattern that:
    - Allows capturing and externalizing an object’s internal state without violating encapsulation, so that the object can later be restored to that state.

| ------------------------------------------------------------------------- |
| Participant    | Role                                                     |
| ------------------------------------------------------------------------- |
| Originator     | The object whose state needs to be saved/restored        |
| Memento        | Stores the internal state of the Originator              |
| Caretaker      | Manages the history of mementos but does not modify them |
| ------------------------------------------------------------------------- |

*/


public class Main {
    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        textArea.setText("text1");
        TextArea.Memento memento = textArea.takeSnapshot();
        textArea.setText("text2");
        textArea.restoreSnapshot(memento);
        System.out.println(textArea.getText());
    }
}
