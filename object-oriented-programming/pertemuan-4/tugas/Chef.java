package tugas;

import java.util.ArrayList;
import java.util.List;

public class Chef extends Employee {
    List<String> certifications;

    public Chef(String noKtp, String name, int age, Restaurant restaurant) {
        super(noKtp, name, age, restaurant);
        this.certifications = new ArrayList<>();
    }

    public void addCertifications(String certification) {
        this.certifications.add(certification);
    }
}
