package java_collections_streams.java_generics.resume_screening_system;

import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public void displayResumes() {
        for (T resume : resumes) {
            System.out.println(resume);
            resume.screenResume();
        }
    }

    // Wildcard method to handle multiple job roles dynamically
    public static void screenAllResumes(List<? extends JobRole> resumes) {
        System.out.println("\n--- Screening All Resumes ---");
        for (JobRole resume : resumes) {
            System.out.println(resume);
            resume.screenResume();
        }
    }
}