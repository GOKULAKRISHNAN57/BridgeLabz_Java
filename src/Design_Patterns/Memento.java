package Design_Patterns;

class Memento {
    String state;

    Memento(String s) {
        state = s;   // store state
    }

    String getState() {
        return state;
    }
}

class Editor {

    String text;

    void set(String t) {
        text = t;
    }

    Memento save() {
        return new Memento(text);   // save state
    }

    void restore(Memento m) {
        text = m.getState();   // restore state
    }
}

class MementoDemo {
    public static void main(String[] args) {
        Editor e = new Editor();

        e.set("Version1");
        Memento m = e.save();

        e.set("Version2");
        e.restore(m);

        System.out.println(e.text); // Version1
    }
}