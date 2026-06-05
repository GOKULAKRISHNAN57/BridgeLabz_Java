package Annotations;

import java.util.*;

public class SuppressWarningExample {

    @SuppressWarnings("unchecked")   // suppress warning
    public static void main(String[] args) {

        List list = new ArrayList();   // raw type warning ignored
        list.add("Hello");

        System.out.println(list.get(0));
    }
}