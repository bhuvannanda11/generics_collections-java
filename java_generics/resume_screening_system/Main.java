import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> seResumes = new Resume<>();
        seResumes.addResume(new SoftwareEngineer("Aman", "Java, Spring Boot, AWS"));
        seResumes.addResume(new SoftwareEngineer("Harshita", "Python, Django, Docker"));

        Resume<DataScientist> dsResumes = new Resume<>();
        dsResumes.addResume(new DataScientist("Prashant", "Python, TensorFlow, SQL"));
        dsResumes.addResume(new DataScientist("Dona", "R, Machine Learning, NLP"));


        Resume<ProductManager> pmResumes = new Resume<>();
        pmResumes.addResume(new ProductManager("Rahul", "Agile, JIRA, Roadmapping"));
        pmResumes.addResume(new ProductManager("Himanshi", "Stakeholder Management, Analytics"));

        System.out.println("\n--- Software Engineer Resumes ---");
        seResumes.displayResumes();

        System.out.println("\n--- Data Scientist Resumes ---");
        dsResumes.displayResumes();

        System.out.println("\n--- Product Manager Resumes ---");
        pmResumes.displayResumes();

        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(new SoftwareEngineer("Vanshika", "C++, Git, Kubernetes"));
        allResumes.add(new DataScientist("Bhupinder", "SQL, PowerBI, ETL"));
        allResumes.add(new ProductManager("Prasad", "UX Research, Leadership"));

        Resume.screenAllResumes(allResumes);
    }
}