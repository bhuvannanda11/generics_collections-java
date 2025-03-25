import java.util.*;
class Patient{
    String name;
    int severity;

    public Patient(String name,int severity){
        this.name = name;
        this.severity = severity;
    }
}
public class hospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> st = new PriorityQueue<>((p1,p2) -> Integer.compare(p2.severity, p1.severity));
        st.add(new Patient("Alice",5));
        st.add(new Patient("Bob",3));
        st.add(new Patient("Mitali",2));

        System.out.println("Order of treatment according to the level of severity = ");

        while (!st.isEmpty()){
            Patient p = st.poll();
            System.out.println(p.name+" "+"Severity = "+p.severity);
        }
    }
}