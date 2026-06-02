package Collection_Streams_Junit_Regex.Generics_;

import java.util.ArrayList;
import java.util.List;

abstract class JobRole {

    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}

class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {

    private String candidateName;
    private T role;

    public Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getRole() {
        return role;
    }
}

public class AIDrivenResumeScreeningSystem {

    public static <T extends JobRole> void processResume(
            Resume<T> resume) {

        System.out.println(
                resume.getCandidateName()
                        + " applied for "
                        + resume.getRole().getRoleName());
    }

    public static void screenRoles(
            List<? extends JobRole> roles) {

        for (JobRole role : roles) {
            System.out.println(role.getRoleName());
        }
    }

    public static void main(String[] args) {

        Resume<SoftwareEngineer> resume =
                new Resume<>("John",
                        new SoftwareEngineer());

        processResume(resume);

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        screenRoles(roles);
    }
}