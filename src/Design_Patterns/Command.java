package Design_Patterns;

interface Command {
    void execute();
}

class Light {
    void on() {
        System.out.println("Light ON");
    }
}

class LightOnCommand implements Command {

    Light light;

    LightOnCommand(Light l) {
        light = l;
    }

    public void execute() {
        light.on();   // encapsulated action
    }
}

class Remote {

    Command command;

    void setCommand(Command c) {
        command = c;
    }

    void press() {
        command.execute();   // trigger command
    }
}

class CommandDemo {
    public static void main(String[] args) {
        Light l = new Light();
        Command cmd = new LightOnCommand(l);

        Remote r = new Remote();
        r.setCommand(cmd);
        r.press();
    }
}