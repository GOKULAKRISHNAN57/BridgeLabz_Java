package Annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// custom annotation
@Retention(RetentionPolicy.RUNTIME)   // runtime availability
@Target(ElementType.METHOD)           // used on methods
@interface MyAnnotation {

    String name();
    int version() default 1;
}

public class CustomAnnotationExample {

    @MyAnnotation(name = "TestMethod", version = 2)
    void test() {
        System.out.println("Inside method");
    }

    public static void main(String[] args) throws Exception {

        CustomAnnotationExample obj = new CustomAnnotationExample();

        Method m = obj.getClass().getMethod("test");

        if (m.isAnnotationPresent(MyAnnotation.class)) {

            MyAnnotation a = m.getAnnotation(MyAnnotation.class);

            System.out.println("Name: " + a.name());
            System.out.println("Version: " + a.version());
        }
    }
}