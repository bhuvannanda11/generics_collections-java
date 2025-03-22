import java.util.ArrayList;
import java.util.List;

// Abstract class representing a Job Role
abstract class JobRole {
    protected String candidateName;
    protected int experienceYears;

    public JobRole(String candidateName, int experienceYears) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
    }

    public abstract String getJobRole();

    public String getCandidateDetails() {
        return "Candidate: " + candidateName + " | Experience: " + experienceYears + " years | Role: " + getJobRole();
    }
}

// Different Job Roles extending JobRole
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    public String getJobRole() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    public String getJobRole() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    public String getJobRole() {
        return "Product Manager";
    }
}

// Generic class to process resumes
class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public List<T> getResumes() {
        return resumes;
    }
}

// AI Screening System
class ResumeScreeningSystem {
    public static <T extends JobRole> void screenResumes(Resume<T> resumeList) {
        System.out.println("Screening Resumes for: " + resumeList.getResumes().get(0).getJobRole());
        for (T resume : resumeList.getResumes()) {
            System.out.println(resume.getCandidateDetails());
        }
    }

    public static void processAllResumes(List<? extends JobRole> resumes) {
        System.out.println("\nProcessing All Resumes:");
        for (JobRole resume : resumes) {
            System.out.println(resume.getCandidateDetails());
        }
    }
}

// Main class to test the Resume Screening System
public class ResumeScreeningTest {
    public static void main(String[] args) {
        // Software Engineer Resumes
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        softwareEngineerResumes.addResume(new SoftwareEngineer("Alice Johnson", 5));
        softwareEngineerResumes.addResume(new SoftwareEngineer("Bob Williams", 3));

        // Data Scientist Resumes
        Resume<DataScientist> dataScientistResumes = new Resume<>();
        dataScientistResumes.addResume(new DataScientist("Charlie Brown", 4));
        dataScientistResumes.addResume(new DataScientist("David Smith", 6));

        // Product Manager Resumes
        Resume<ProductManager> productManagerResumes = new Resume<>();
        productManagerResumes.addResume(new ProductManager("Eve Adams", 7));
        productManagerResumes.addResume(new ProductManager("Frank White", 8));

        // Screening individual job roles
        ResumeScreeningSystem.screenResumes(softwareEngineerResumes);
        ResumeScreeningSystem.screenResumes(dataScientistResumes);
        ResumeScreeningSystem.screenResumes(productManagerResumes);

        // Processing all resumes together using wildcard
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.addAll(softwareEngineerResumes.getResumes());
        allResumes.addAll(dataScientistResumes.getResumes());
        allResumes.addAll(productManagerResumes.getResumes());

        ResumeScreeningSystem.processAllResumes(allResumes);
    }
}