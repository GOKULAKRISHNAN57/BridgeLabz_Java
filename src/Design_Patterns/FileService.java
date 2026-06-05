package Design_Patterns;

interface FileService {
    void access();
}

class RealFile implements FileService {
    public void access() {
        System.out.println("Accessing File");
    }
}

class ProxyFile implements FileService {

    RealFile rf = new RealFile();

    public void access() {
        if (true) {           // access control check
            rf.access();      // delegate to real object
        }
    }
}

class ProxyDemo {
    public static void main(String[] args) {
        FileService fs = new ProxyFile();
        fs.access();
    }
}