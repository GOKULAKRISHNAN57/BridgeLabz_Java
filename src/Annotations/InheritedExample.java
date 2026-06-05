package Annotations;

import java.lang.annotation.*;

@Inherited   // inherited by child class
@Retention(RetentionPolicy.RUNTIME)
@interface InheritedAnnotation {}

@InheritedAnnotation
class Parent {}

class Child extends Parent {}

public class InheritedExample {

    public static void main(String[] args) {

        boolean present = Child.class
                .isAnnotationPresent(InheritedAnnotation.class);

        System.out.println("Inherited: " + present);
    }
}