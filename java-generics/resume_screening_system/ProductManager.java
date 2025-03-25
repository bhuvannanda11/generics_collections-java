public class ProductManager extends JobRole {
    public ProductManager(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    public void screenResume() {
        System.out.println(getCandidateName() + " (Product Manager) is screened with skills: " + getSkills());
    }
}