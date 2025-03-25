public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    public void screenResume() {
        System.out.println(getCandidateName() + " (Software Engineer) is screened with skills: " + getSkills());
    }
}