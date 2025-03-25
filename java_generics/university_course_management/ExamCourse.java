package java_collections_streams.java_generics.university_course_management;

public class ExamCourse extends CourseType{
    public ExamCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated through exams");
    }
}
