package java_collections_streams.java_generics.resume_screening_system;

public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    public void screenResume() {
        System.out.println(getCandidateName() + " (Software Engineer) is screened with skills: " + getSkills());
    }
}