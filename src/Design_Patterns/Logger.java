package Design_Patterns;
class Logger {

    private static Logger instance;   // holds single object

    private Logger() {}               // private → restrict new

    static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // created once
        }
        return instance;
    }

    void log(String msg) {
        System.out.println(msg);
    }
}

class SingletonDemo {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.log("Singleton Working");

        System.out.println(l1 == l2); // true → same object
    }
}