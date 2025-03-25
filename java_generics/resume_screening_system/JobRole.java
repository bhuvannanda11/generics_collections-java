public abstract class JobRole {
    private String candidateName;
    private String skills;

    public JobRole(String candidateName, String skills) {
        this.candidateName = candidateName;
        this.skills = skills;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getSkills() {
        return skills;
    }

    public abstract void screenResume();

    @Override
    public String toString() {
        return candidateName + " | Skills: " + skills;
    }
}