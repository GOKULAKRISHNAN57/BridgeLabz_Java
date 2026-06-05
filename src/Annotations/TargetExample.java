package Annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)   // applied only to class
@Retention(RetentionPolicy.RUNTIME)
@interface TargetAnnotation {}

@TargetAnnotation
public class TargetExample {

    public static void main(String[] args) {
        System.out.println("Target Annotation Example");
    }
}