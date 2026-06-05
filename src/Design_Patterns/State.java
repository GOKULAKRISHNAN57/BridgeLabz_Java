package Design_Patterns;

interface State {
    void action();
}

class CardInserted implements State {
    public void action() {
        System.out.println("Card Inserted");
    }
}

class ATM {

    State state;

    void setState(State s) {
        state = s;   // change behavior
    }

    void doAction() {
        state.action();
    }
}

class StateDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.setState(new CardInserted());
        atm.doAction();
    }
}