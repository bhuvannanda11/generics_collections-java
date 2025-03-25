package java_collections_streams.java_generics.university_course_management;

abstract public class CourseType {
    String courseName;
    String department;

    public CourseType(String courseName, String department) {
        this.courseName = courseName;
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return department;
    }

    abstract public void evaluate();

    @Override
    public String toString() {
        return "CourseType{" +
                "courseName='" + courseName + '\'' +
                ", department=" + department +
                '}';
    }
}
