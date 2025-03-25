package java_collections_streams.java_generics.resume_screening_system;

public class DataScientist extends JobRole {
    public DataScientist(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    public void screenResume() {
        System.out.println(getCandidateName() + " (Data Scientist) is screened with skills: " + getSkills());
    }
}