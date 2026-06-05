package Annotations;

import java.lang.annotation.*;

@Documented   // included in javadoc
@Retention(RetentionPolicy.RUNTIME)
@interface DocumentedAnnotation {}

@DocumentedAnnotation
public class DocumentedExample {

    public static void main(String[] args) {
        System.out.println("Documented Annotation Example");
    }
}