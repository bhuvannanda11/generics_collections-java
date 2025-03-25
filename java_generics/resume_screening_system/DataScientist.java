public class DataScientist extends JobRole {
    public DataScientist(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    public void screenResume() {
        System.out.println(getCandidateName() + " (Data Scientist) is screened with skills: " + getSkills());
    }
}