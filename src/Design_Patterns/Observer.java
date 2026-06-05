package Design_Patterns;

import java.util.*;

interface Observer {
    void update(String msg);
}

class Subject {

    List<Observer> list = new ArrayList<>();

    void add(Observer o) {
        list.add(o);   // register
    }

    void notifyAllObs(String msg) {
        for (Observer o : list)
            o.update(msg);   // notify all
    }
}

class Channel implements Observer {
    public void update(String msg) {
        System.out.println("Received: " + msg);
    }
}

class ObserverDemo {
    public static void main(String[] args) {
        Subject s = new Subject();

        s.add(new Channel());
        s.notifyAllObs("News");
    }
}