package Design_Patterns;

import java.util.*;

class NameRepository {

    List<String> names = Arrays.asList("A", "B", "C");

    Iterator<String> getIterator() {
        return names.iterator();   // return iterator
    }
}

class IteratorDemo {
    public static void main(String[] args) {
        NameRepository repo = new NameRepository();

        Iterator<String> it = repo.getIterator();

        while (it.hasNext()) {        // check next
            System.out.println(it.next()); // get element
        }
    }
}