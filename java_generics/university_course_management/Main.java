package java_collections_streams.java_generics.university_course_management;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Courses<ExamCourse> examCourses = new Courses<>();
        examCourses.addCourse(new ExamCourse("Maths", "Science"));
        examCourses.addCourse(new ExamCourse("Physics", "Engineering"));

        Courses<AssignmentCourse> assignmentCourses = new Courses<>();
        assignmentCourses.addCourse(new AssignmentCourse("English", "Arts"));
        assignmentCourses.addCourse(new AssignmentCourse("History", "Humanities"));

        Courses<ResearchCourse> researchCourses = new Courses<>();
        researchCourses.addCourse(new ResearchCourse("AI Research", "Computer Science"));

        System.out.println("\n--- Exam Courses ---");
        examCourses.displayCourses();

        System.out.println("\n--- Assignment Courses ---");
        assignmentCourses.displayCourses();

        System.out.println("\n--- Research Courses ---");
        researchCourses.displayCourses();

        // Using wildcard to handle all courses
        ArrayList<CourseType> allCourses = new ArrayList<>();
        allCourses.add(new ExamCourse("Biology", "Science"));
        allCourses.add(new AssignmentCourse("Psychology", "Social Science"));
        allCourses.add(new ResearchCourse("Quantum Computing", "Physics"));

        System.out.println("\n--- Display All Courses with Wildcard ---");
        Courses.displayAllCourses(allCourses);
    }
}
