import java.util.ArrayList;
import java.util.List;

// Abstract class representing a course type
abstract class CourseType {
    private String courseName;
    private String instructor;

    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return courseName + " (Instructor: " + instructor + ")";
    }
}

// Different types of courses
class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }
}

// Generic class to manage different courses
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
}

// Utility class to handle courses dynamically
class UniversityUtils {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}

// Main class to test the University Course Management System
public class UniversityTest {
    public static void main(String[] args) {
        // Managing Exam-Based Courses
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics", "Dr. Smith"));
        examCourses.addCourse(new ExamCourse("Physics", "Dr. Johnson"));

        // Managing Assignment-Based Courses
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Software Engineering", "Prof. Davis"));
        assignmentCourses.addCourse(new AssignmentCourse("Database Management", "Dr. Brown"));

        // Managing Research-Based Courses
        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("Artificial Intelligence", "Dr. White"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing", "Dr. Black"));

        // Displaying courses using wildcard method
        System.out.println("Exam-Based Courses:");
        UniversityUtils.displayCourses(examCourses.getCourses());

        System.out.println("\nAssignment-Based Courses:");
        UniversityUtils.displayCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch-Based Courses:");
        UniversityUtils.displayCourses(researchCourses.getCourses());
    }
}