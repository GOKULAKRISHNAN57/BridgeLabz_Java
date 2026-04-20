package object_oriented_programming.java_oop_design.Sample_Problems;

import java.util.ArrayList;
import java.util.List;

class Student{

    String name;
    private List<Subject> subjects = new ArrayList<>();

    Student(String name){
        this.name = name;
    }

    public void addSubjects(Subject subject){
        subjects.add(subject);
    }

    public int totalMarks(){
        return GradeCalculator.totalMarks(subjects);
    }

}

class Subject{

    String subject;
    int marks;

    Subject(String subject, int marks){
        this.subject = subject;
        this.marks = marks;
    }

}

class GradeCalculator{

    public static int totalMarks(List<Subject> subjects){
        int totalMarks = 0;
        for(Subject subject : subjects){
            totalMarks += subject.marks;
        }

        return totalMarks;
    }

}

public class School_Results_Application {

    public static void main(String[] args) {

        Student student = new Student("John");
        Subject subject1 = new Subject("Maths",90);
        Subject subject2 = new Subject("Science",95);

        student.addSubjects(subject1);
        student.addSubjects(subject2);

        System.out.println(student.totalMarks());

    }
}
