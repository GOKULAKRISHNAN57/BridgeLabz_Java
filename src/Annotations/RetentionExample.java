package Annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)   // available at runtime
@interface RetentionAnnotation {}

public class RetentionExample {

    @RetentionAnnotation
    void method() {}

    public static void main(String[] args) throws Exception {

        RetentionExample obj = new RetentionExample();

        boolean present = obj.getClass()
                .getMethod("method")
                .isAnnotationPresent(RetentionAnnotation.class);

        System.out.println("Annotation present: " + present);
    }
}