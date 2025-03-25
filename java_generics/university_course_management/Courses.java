package java_collections_streams.java_generics.university_course_management;

import java.util.ArrayList;
import java.util.List;

public class Courses<T extends CourseType>{
    List<T> courses = new ArrayList<>();

    public void addCourse(T course){
        courses.add(course);
    }

    public void displayCourses() {
        for(T course : courses){
            System.out.println(course);
            course.evaluate();
        }
    }

    public static void displayAllCourses(List<? extends CourseType> courses){
        for(CourseType course : courses){
            System.out.println(course);
            course.evaluate();
        }
    }
}