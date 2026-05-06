package Data_Structure_And_Algorithm.Linked_List;

class State {
    String text;
    State prev, next;

    State(String text) {
        this.text = text;
    }
}

class Editor {
    State head = null, current = null;
    int size = 0, limit = 10;

    void addState(String text) {
        State newState = new State(text);

        if (current != null) current.next = null;

        newState.prev = current;

        if (current != null) current.next = newState;
        current = newState;

        if (head == null) head = newState;

        size++;

        if (size > limit) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    void display() {
        if (current != null)
            System.out.println("Current: " + current.text);
    }
}

public class UndoRedoFunctionalityForTextEditor {
    public static void main(String[] args) {
        Editor e = new Editor();

        e.addState("Hello");
        e.addState("Hello World");
        e.addState("Hello Java");

        e.undo();
        e.display();

        e.redo();
        e.display();
    }
}