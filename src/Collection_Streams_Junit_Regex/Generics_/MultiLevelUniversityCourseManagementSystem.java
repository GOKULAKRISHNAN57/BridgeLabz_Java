package Collection_Streams_Junit_Regex.Generics_;

import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String evaluationType;

    public CourseType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

    public String getEvaluationType() {
        return evaluationType;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam Based");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment Based");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research Based");
    }
}

class Course<T extends CourseType> {

    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public T getCourseType() {
        return courseType;
    }
}

public class MultiLevelUniversityCourseManagementSystem {

    public static void displayCourses(
            List<? extends CourseType> courseTypes) {

        for (CourseType courseType : courseTypes) {
            System.out.println(courseType.getEvaluationType());
        }
    }

    public static void main(String[] args) {

        Course<ExamCourse> javaCourse =
                new Course<>("Java Programming",
                        new ExamCourse());

        List<ExamCourse> courses = new ArrayList<>();
        courses.add(new ExamCourse());

        displayCourses(courses);

        System.out.println(javaCourse.getCourseName());
    }
}